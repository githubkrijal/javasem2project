package loginuser;


import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Objects;

public class homepage implements ActionListener {
    DefaultTableModel model = new DefaultTableModel();
    JTable jt= new JTable(model);

    Font fon1,fon2,fon3;
    JLabel lbl_profile_heading,lbl_fname, lbl_lname, lbl_username,lbl_email,lbl_gender,lbl_pass,lbl_cpass,lbl_imgpro;
    ImageIcon product1,product2,product3,product4,product5,product6,product7,product8,product9,product10;
    JButton btn_update,btn_product1,btn_product2;
    String user;
    public homepage(JPanel panel) {


        product1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product1);
        lbl_imgpro.setBounds(30, 20, 190, 160);
        panel.add(lbl_imgpro);

        btn_product1=new JButton("Add To Cart");
        btn_product1.setFont(fon1);
        btn_product1.setBackground(new Color(11,135,15));
        btn_product1.setBorder(new LineBorder(Color.green,4));
        btn_product1.setForeground(new Color(255,255,255));
        btn_product1.setBounds(30,220,190,50);
        btn_product1.addActionListener(this);
        panel.add(btn_product1);

        product2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item3.png")));
        lbl_imgpro = new JLabel(product2);
        lbl_imgpro.setBounds(250, 20, 190, 160);
        panel.add(lbl_imgpro);

        product3 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item1.png")));
        lbl_imgpro = new JLabel(product3);
        lbl_imgpro.setBounds(470, 20, 190, 160);
        panel.add(lbl_imgpro);

        product4 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product4);
        lbl_imgpro.setBounds(700, 20, 190, 160);
        panel.add(lbl_imgpro);

        product5 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product5);
        lbl_imgpro.setBounds(920, 20, 190, 160);
        panel.add(lbl_imgpro);

        product6 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product6);
        lbl_imgpro.setBounds(30, 350, 190, 160);
        panel.add(lbl_imgpro);

        product7 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product7);
        lbl_imgpro.setBounds(250, 350, 190, 160);
        panel.add(lbl_imgpro);

        product8 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product8);
        lbl_imgpro.setBounds(470, 350, 190, 160);
        panel.add(lbl_imgpro);

        product9 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product9);
        lbl_imgpro.setBounds(700, 350, 190, 160);
        panel.add(lbl_imgpro);

        product10 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product10);
        lbl_imgpro.setBounds(920, 350, 190, 160);
        panel.add(lbl_imgpro);






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

    }
}


