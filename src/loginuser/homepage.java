package loginuser;


import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Objects;

public class homepage implements ActionListener {
    DefaultTableModel model = new DefaultTableModel();
    JTable jt = new JTable(model);

    Font fon1, fon2, fon3, fon5;
    JLabel lbl_product1, lbl_profile_heading, lbl_fname, lbl_lname, lbl_username, lbl_email, lbl_gender, lbl_pass, lbl_cpass, lbl_imgpro;
    ImageIcon product1, product2, product3, product4, product5, product6, product7, product8, product9, product10;
    JButton btn_update, btn_product1, btn_product2, btn_product3, btn_product4, btn_product5, btn_product6, btn_product7, btn_product8, btn_product9, btn_product10;
    String user;

    public homepage(JPanel panel) {
        fon5 = new Font("algerian", Font.BOLD, 25);


        product1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product1);
        lbl_imgpro.setBounds(30, 20, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product1 = new JLabel("Milk shake");
        lbl_product1.setFont(fon5);
        lbl_product1.setBounds(30, 180, 190, 40);
        lbl_product1.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product1);

        btn_product1 = new JButton("Add To Cart");
        btn_product1.setFont(fon1);
        btn_product1.setBackground(new Color(11, 135, 15));
        btn_product1.setBorder(new LineBorder(Color.green, 4));
        btn_product1.setForeground(new Color(255, 255, 255));
        btn_product1.setBounds(30, 220, 190, 50);
        btn_product1.addActionListener(this);
        panel.add(btn_product1);

        product2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item3.png")));
        lbl_imgpro = new JLabel(product2);
        lbl_imgpro.setBounds(250, 20, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product1 = new JLabel("Milk shake");
        lbl_product1.setFont(fon5);
        lbl_product1.setBounds(250, 180, 190, 40);
        lbl_product1.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product1);

        btn_product2 = new JButton("Add To Cart");
        btn_product2.setFont(fon1);
        btn_product2.setBackground(new Color(11, 135, 15));
        btn_product2.setBorder(new LineBorder(Color.green, 4));
        btn_product2.setForeground(new Color(255, 255, 255));
        btn_product2.setBounds(250, 220, 190, 50);
        btn_product2.addActionListener(this);
        panel.add(btn_product2);

        product3 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item1.png")));
        lbl_imgpro = new JLabel(product3);
        lbl_imgpro.setBounds(470, 20, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product1 = new JLabel("Milk shake");
        lbl_product1.setFont(fon5);
        lbl_product1.setBounds(470, 180, 190, 40);
        lbl_product1.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product1);

        btn_product3 = new JButton("Add To Cart");
        btn_product3.setFont(fon1);
        btn_product3.setBackground(new Color(11, 135, 15));
        btn_product3.setBorder(new LineBorder(Color.green, 4));
        btn_product3.setForeground(new Color(255, 255, 255));
        btn_product3.setBounds(470, 220, 190, 50);
        btn_product3.addActionListener(this);
        panel.add(btn_product3);

        product4 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product4);
        lbl_imgpro.setBounds(700, 20, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product1 = new JLabel("Milk shake");
        lbl_product1.setFont(fon5);
        lbl_product1.setBounds(700, 180, 190, 40);
        lbl_product1.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product1);

        btn_product4 = new JButton("Add To Cart");
        btn_product4.setFont(fon1);
        btn_product4.setBackground(new Color(11, 135, 15));
        btn_product4.setBorder(new LineBorder(Color.green, 4));
        btn_product4.setForeground(new Color(255, 255, 255));
        btn_product4.setBounds(700, 220, 190, 50);
        btn_product4.addActionListener(this);
        panel.add(btn_product4);

        product5 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product5);
        lbl_imgpro.setBounds(920, 20, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product1 = new JLabel("Milk shake");
        lbl_product1.setFont(fon5);
        lbl_product1.setBounds(920, 180, 190, 40);
        lbl_product1.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product1);

        btn_product5 = new JButton("Add To Cart");
        btn_product5.setFont(fon1);
        btn_product5.setBackground(new Color(11, 135, 15));
        btn_product5.setBorder(new LineBorder(Color.green, 4));
        btn_product5.setForeground(new Color(255, 255, 255));
        btn_product5.setBounds(920, 220, 190, 50);
        btn_product5.addActionListener(this);
        panel.add(btn_product5);

        product6 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product6);
        lbl_imgpro.setBounds(30, 350, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product1 = new JLabel("Milk shake");
        lbl_product1.setFont(fon5);
        lbl_product1.setBounds(30, 510, 190, 40);
        lbl_product1.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product1);

        btn_product6 = new JButton("Add To Cart");
        btn_product6.setFont(fon1);
        btn_product6.setBackground(new Color(11, 135, 15));
        btn_product6.setBorder(new LineBorder(Color.green, 4));
        btn_product6.setForeground(new Color(255, 255, 255));
        btn_product6.setBounds(30, 550, 190, 50);
        btn_product6.addActionListener(this);
        panel.add(btn_product6);

        product7 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product7);
        lbl_imgpro.setBounds(250, 350, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product1 = new JLabel("Milk shake");
        lbl_product1.setFont(fon5);
        lbl_product1.setBounds(250, 510, 190, 40);
        lbl_product1.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product1);

        btn_product7 = new JButton("Add To Cart");
        btn_product7.setFont(fon1);
        btn_product7.setBackground(new Color(11, 135, 15));
        btn_product7.setBorder(new LineBorder(Color.green, 4));
        btn_product7.setForeground(new Color(255, 255, 255));
        btn_product7.setBounds(250, 550, 190, 50);
        btn_product7.addActionListener(this);
        panel.add(btn_product7);

        product8 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product8);
        lbl_imgpro.setBounds(470, 350, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product1 = new JLabel("Milk shake");
        lbl_product1.setFont(fon5);
        lbl_product1.setBounds(470, 510, 190, 40);
        lbl_product1.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product1);

        btn_product8 = new JButton("Add To Cart");
        btn_product8.setFont(fon1);
        btn_product8.setBackground(new Color(11, 135, 15));
        btn_product8.setBorder(new LineBorder(Color.green, 4));
        btn_product8.setForeground(new Color(255, 255, 255));
        btn_product8.setBounds(470, 550, 190, 50);
        btn_product8.addActionListener(this);
        panel.add(btn_product8);

        product9 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product9);
        lbl_imgpro.setBounds(700, 350, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product1 = new JLabel("Milk shake");
        lbl_product1.setFont(fon5);
        lbl_product1.setBounds(700, 510, 190, 40);
        lbl_product1.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product1);

        btn_product9 = new JButton("Add To Cart");
        btn_product9.setFont(fon1);
        btn_product9.setBackground(new Color(11, 135, 15));
        btn_product9.setBorder(new LineBorder(Color.green, 4));
        btn_product9.setForeground(new Color(255, 255, 255));
        btn_product9.setBounds(700, 550, 190, 50);
        btn_product9.addActionListener(this);
        panel.add(btn_product9);

        product10 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product10);
        lbl_imgpro.setBounds(920, 350, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product1 = new JLabel("Milk shake");
        lbl_product1.setFont(fon5);
        lbl_product1.setBounds(920, 510, 190, 40);
        lbl_product1.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product1);

        btn_product10 = new JButton("Add To Cart");
        btn_product10.setFont(fon1);
        btn_product10.setBackground(new Color(11, 135, 15));
        btn_product10.setBorder(new LineBorder(Color.green, 4));
        btn_product10.setForeground(new Color(255, 255, 255));
        btn_product10.setBounds(920, 550, 190, 50);
        btn_product10.addActionListener(this);
        panel.add(btn_product10);






        /*fon=new Font("Dialog", Font.BOLD, 22);
        fon1=new Font("Serif", Font.BOLD, 18);
        jt.setFont(fon1);
        jt.setRowHeight(40);
        jt.setBackground(new Color(211,244,252));
        model.addColumn("Id");
        model.addColumn("User Name");
        model.addColumn("Mobile Name");
        model.addColumn("Company");
        model.addColumn("RAM");
        model.addColumn("Storage");
        model.addColumn("Price");
        model.addColumn("Processor");
        model.addColumn("Camera");
        model.addColumn("Contact");
        JTableHeader header = jt.getTableHeader();
        header.setFont(fon);
        header.setBackground(Color.black);
        header.setForeground(Color.white);
        jt.getTableHeader().setPreferredSize(new Dimension(100,50));
        try {
            DbOperation db=new DbOperation();
            String query="select * from buysell";
            ResultSet rs=db.select(query);
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1), rs.getString(2),rs.getString(3),
                        rs.getString(4),rs.getString(5), rs.getString(6),rs.getString(7),
                        rs.getString(8),rs.getString(9),rs.getString(10)});
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        JScrollPane pg = new JScrollPane(jt);
        pg.setBounds(0,0,1220,480);
        panel.add(pg);*/
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_product1) {
            String product_1 = lbl_product1.getText();
            System.out.println(product_1);

        }
    }

}
