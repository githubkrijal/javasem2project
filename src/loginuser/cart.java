package loginuser;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class cart implements ActionListener {
    JLabel lbl_topic;
    JTextField txt_id;
    JButton btn_delete,btn_orderCart;
    Font fon,fon1,fon3,fon5;
    String user;
    JPanel panel,panel_orderCart,panel_order;
    JTable jt;
    DefaultTableModel model;
    JScrollPane pg;


    public void del(JPanel panel,String user) {
        this.user=user;
        this.panel=panel;
        jt= new JTable();
        model = (DefaultTableModel) jt.getModel();
        jt.setFont(fon1);
        jt.setRowHeight(40);
        jt.setBackground(new Color(61,150,255));

        model.addColumn("Item number");
        model.addColumn("Product Name");
        model.addColumn("Price");


        JTableHeader header = jt.getTableHeader();
        header.setFont(fon);
        header.setBackground(new Color(62,40,90));
        header.setForeground(Color.white);
        jt.getTableHeader().setPreferredSize(new Dimension(100,50));
        try {
            DbOperation db=new DbOperation();
            String query="select * from product where username='"+user+"'";
            ResultSet rs=db.select(query);

             while(rs.next()){
                 model.addRow(new Object[]{rs.getString(1),rs.getString(3),
                         rs.getString(4)});
                 System.out.println(rs.getString(1));
             }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        pg = new JScrollPane(jt);
        pg.setBounds(10,50,700,800);
        panel.add(pg);
    }

    public cart(JPanel panel, String user) {
        this.user=user;
        this.panel=panel;
        fon=new Font("Dialog", Font.BOLD, 22);
        fon1=new Font("Serif", Font.BOLD, 18);
        fon3=new Font("Serif", Font.BOLD, 30);
        fon5 = new Font("algerian", Font.BOLD, 25);


        lbl_topic = new JLabel("Remove item from cart :");
        lbl_topic.setFont(fon5);
        lbl_topic.setBounds(780, 400, 500, 40);
        lbl_topic.setForeground(new Color(255, 255, 200));
        panel.add(lbl_topic);

        txt_id=new JTextField();
        txt_id.setFont(fon5);
        txt_id.setBounds(865,450,170,45);
        txt_id.setBackground(new Color(255,255,255));
        panel.add(txt_id);

        btn_delete = new JButton("DELETE");
        btn_delete.setFont(fon5);
        btn_delete.setBackground(new Color(11, 135, 15));
        btn_delete.setBorder(new LineBorder(Color.red, 4));
        btn_delete.setForeground(Color.red);
        btn_delete.setBounds(855, 525, 190, 50);
        btn_delete.addActionListener(this);
        panel.add(btn_delete);
        del(panel,user);

        btn_orderCart = new JButton(" Purchase ");
        btn_orderCart.setFont(fon5);
        btn_orderCart.setBackground(new Color(11, 135, 15));
        btn_orderCart.setBorder(new LineBorder(Color.green, 4));
        btn_orderCart.setForeground(Color.white);
        btn_orderCart.setBounds(855, 125, 200, 50);
        btn_orderCart.addActionListener(this);
        panel.add(btn_orderCart);


        panel_orderCart= new JPanel();
        panel_orderCart.setLayout(null);
        panel_orderCart.setLocation(0, 0);
        panel_orderCart.setBounds(0,100,1175,705);
        panel_orderCart.setBackground(new Color(68,2,150));
        panel.add(panel_orderCart);



    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn_delete) {
            try {
                DbOperation db=new DbOperation();
                String sql = "DELETE FROM product WHERE id='"+txt_id.getText()+"'";
                int rowsDeleted = db.executeDelete(sql);
                model = (DefaultTableModel) jt.getModel();
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(btn_delete, "Juice has been removed from your cart.");
                    txt_id.setText("");
                    panel.removeAll();
                    panel.repaint();
                    panel.revalidate();
                    new cart(panel,user);
                    del(panel,user);
                    return;
                }
            }
            catch(Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(btn_delete, "No such catagory exist. Please check again.");
            }
        }
        else if(e.getSource()==btn_orderCart) {

            panel_orderCart.removeAll();
            panel_orderCart.repaint();
            panel_orderCart.revalidate();
            panel.setBounds(0,100,1175,600);
            panel_orderCart.setBounds(0,0,0,0);
            new orders(panel_orderCart,user);
        }
        JOptionPane.showMessageDialog(btn_orderCart, "Juice Ordered!");
    }
}





