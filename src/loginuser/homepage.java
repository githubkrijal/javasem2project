package loginuser;


import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.JButton;
import javax.swing.JPanel;

public class homepage implements ActionListener {
    Font fon1, fon6, fon5;
    JLabel lbl_product1, lbl_productp1, lbl_productp2, lbl_product2, lbl_product3, lbl_productp3, lbl_product4,lbl_productp4,
            lbl_product5, lbl_productp5, lbl_productp6, lbl_product6, lbl_product7, lbl_productp7, lbl_product8,lbl_productp8,
            lbl_product9, lbl_productp9, lbl_productp10, lbl_product10, lbl_imgpro;
    ImageIcon product1, product2, product3, product4, product5, product6, product7, product8, product9, product10;
    JButton btn_product1, btn_product2, btn_product3, btn_product4, btn_product5,
            btn_product6, btn_product7, btn_product8, btn_product9, btn_product10;
    String user;

    public homepage(JPanel panel, String user) {
        this.user = user;
        fon5 = new Font("algerian", Font.BOLD, 25);
        fon1 = new Font("algerian", Font.BOLD, 20);
        fon6 = new Font("algerian", Font.BOLD, 15);


        product1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item1.png")));
        lbl_imgpro = new JLabel(product1);
        lbl_imgpro.setBounds(30, 20, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product1 = new JLabel("Can orange juice");
        lbl_product1.setFont(fon5);
        lbl_product1.setBounds(30, 180, 190, 40);
        lbl_product1.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product1);

        lbl_productp1 = new JLabel("Price: $10");
        lbl_productp1.setFont(fon6);
        lbl_productp1.setBounds(80, 205, 190, 40);
        lbl_productp1.setForeground(new Color(255, 255, 200));
        panel.add(lbl_productp1);


        btn_product1 = new JButton("Add To Cart");
        btn_product1.setFont(fon1);
        btn_product1.setBackground(new Color(11, 135, 15));
        btn_product1.setBorder(new LineBorder(Color.green, 4));
        btn_product1.setForeground(new Color(255, 255, 255));
        btn_product1.setBounds(30, 242, 190, 50);
        btn_product1.addActionListener(this);
        panel.add(btn_product1);

        product2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item2.png")));
        lbl_imgpro = new JLabel(product2);
        lbl_imgpro.setBounds(250, 20, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product2 = new JLabel("Strawberry milk shake");
        lbl_product2.setFont(fon5);
        lbl_product2.setBounds(250, 180, 190, 40);
        lbl_product2.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product2);

        lbl_productp2 = new JLabel("Price: $15");
        lbl_productp2.setFont(fon6);
        lbl_productp2.setBounds(300, 205, 190, 40);
        lbl_productp2.setForeground(new Color(255, 255, 200));
        panel.add(lbl_productp2);

        btn_product2 = new JButton("Add To Cart");
        btn_product2.setFont(fon1);
        btn_product2.setBackground(new Color(11, 135, 15));
        btn_product2.setBorder(new LineBorder(Color.green, 4));
        btn_product2.setForeground(new Color(255, 255, 255));
        btn_product2.setBounds(250, 242, 190, 50);
        btn_product2.addActionListener(this);
        panel.add(btn_product2);

        product3 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item3.png")));
        lbl_imgpro = new JLabel(product3);
        lbl_imgpro.setBounds(470, 20, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product3 = new JLabel("Orange milk shake");
        lbl_product3.setFont(fon5);
        lbl_product3.setBounds(470, 180, 190, 40);
        lbl_product3.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product3);

        lbl_productp3 = new JLabel("Price: $22");
        lbl_productp3.setFont(fon6);
        lbl_productp3.setBounds(520, 205, 190, 40);
        lbl_productp3.setForeground(new Color(255, 255, 200));
        panel.add(lbl_productp3);

        btn_product3 = new JButton("Add To Cart");
        btn_product3.setFont(fon1);
        btn_product3.setBackground(new Color(11, 135, 15));
        btn_product3.setBorder(new LineBorder(Color.green, 4));
        btn_product3.setForeground(new Color(255, 255, 255));
        btn_product3.setBounds(470, 242, 190, 50);
        btn_product3.addActionListener(this);
        panel.add(btn_product3);

        product4 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item4.png")));
        lbl_imgpro = new JLabel(product4);
        lbl_imgpro.setBounds(700, 20, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product4 = new JLabel("Banana shake");
        lbl_product4.setFont(fon5);
        lbl_product4.setBounds(700, 180, 190, 40);
        lbl_product4.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product4);

        lbl_productp4 = new JLabel("Price: $14");
        lbl_productp4.setFont(fon6);
        lbl_productp4.setBounds(750, 205, 190, 40);
        lbl_productp4.setForeground(new Color(255, 255, 200));
        panel.add(lbl_productp4);

        btn_product4 = new JButton("Add To Cart");
        btn_product4.setFont(fon1);
        btn_product4.setBackground(new Color(11, 135, 15));
        btn_product4.setBorder(new LineBorder(Color.green, 4));
        btn_product4.setForeground(new Color(255, 255, 255));
        btn_product4.setBounds(700, 242, 190, 50);
        btn_product4.addActionListener(this);
        panel.add(btn_product4);

        product5 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item5.png")));
        lbl_imgpro = new JLabel(product5);
        lbl_imgpro.setBounds(920, 20, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product5 = new JLabel("Mango Juice");
        lbl_product5.setFont(fon5);
        lbl_product5.setBounds(920, 180, 190, 40);
        lbl_product5.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product5);

        lbl_productp5 = new JLabel("Price: $11");
        lbl_productp5.setFont(fon6);
        lbl_productp5.setBounds(970, 205, 190, 40);
        lbl_productp5.setForeground(new Color(255, 255, 200));
        panel.add(lbl_productp5);

        btn_product5 = new JButton("Add To Cart");
        btn_product5.setFont(fon1);
        btn_product5.setBackground(new Color(11, 135, 15));
        btn_product5.setBorder(new LineBorder(Color.green, 4));
        btn_product5.setForeground(new Color(255, 255, 255));
        btn_product5.setBounds(920, 242, 190, 50);
        btn_product5.addActionListener(this);
        panel.add(btn_product5);

        product6 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item6.png")));
        lbl_imgpro = new JLabel(product6);
        lbl_imgpro.setBounds(30, 350, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product6 = new JLabel("Pop Iced Juice");
        lbl_product6.setFont(fon5);
        lbl_product6.setBounds(30, 510, 190, 40);
        lbl_product6.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product6);

        lbl_productp6 = new JLabel("Price: $9");
        lbl_productp6.setFont(fon6);
        lbl_productp6.setBounds(80, 535, 190, 40);
        lbl_productp6.setForeground(new Color(255, 255, 200));
        panel.add(lbl_productp6);

        btn_product6 = new JButton("Add To Cart");
        btn_product6.setFont(fon1);
        btn_product6.setBackground(new Color(11, 135, 15));
        btn_product6.setBorder(new LineBorder(Color.green, 4));
        btn_product6.setForeground(new Color(255, 255, 255));
        btn_product6.setBounds(30, 572, 190, 50);
        btn_product6.addActionListener(this);
        panel.add(btn_product6);

        product7 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item7.png")));
        lbl_imgpro = new JLabel(product7);
        lbl_imgpro.setBounds(250, 350, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product7 = new JLabel("Hot milk shake");
        lbl_product7.setFont(fon5);
        lbl_product7.setBounds(250, 510, 190, 40);
        lbl_product7.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product7);

        lbl_productp7 = new JLabel("Price: $20");
        lbl_productp7.setFont(fon6);
        lbl_productp7.setBounds(300, 535, 190, 40);
        lbl_productp7.setForeground(new Color(255, 255, 200));
        panel.add(lbl_productp7);

        btn_product7 = new JButton("Add To Cart");
        btn_product7.setFont(fon1);
        btn_product7.setBackground(new Color(11, 135, 15));
        btn_product7.setBorder(new LineBorder(Color.green, 4));
        btn_product7.setForeground(new Color(255, 255, 255));
        btn_product7.setBounds(250, 572, 190, 50);
        btn_product7.addActionListener(this);
        panel.add(btn_product7);

        product8 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item8.png")));
        lbl_imgpro = new JLabel(product8);
        lbl_imgpro.setBounds(470, 350, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product8 = new JLabel("Cup shake");
        lbl_product8.setFont(fon5);
        lbl_product8.setBounds(470, 510, 190, 40);
        lbl_product8.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product8);

        lbl_productp8 = new JLabel("Price: $17");
        lbl_productp8.setFont(fon6);
        lbl_productp8.setBounds(520, 535, 190, 40);
        lbl_productp8.setForeground(new Color(255, 255, 200));
        panel.add(lbl_productp8);

        btn_product8 = new JButton("Add To Cart");
        btn_product8.setFont(fon1);
        btn_product8.setBackground(new Color(11, 135, 15));
        btn_product8.setBorder(new LineBorder(Color.green, 4));
        btn_product8.setForeground(new Color(255, 255, 255));
        btn_product8.setBounds(470, 572, 190, 50);
        btn_product8.addActionListener(this);
        panel.add(btn_product8);

        product9 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item9.png")));
        lbl_imgpro = new JLabel(product9);
        lbl_imgpro.setBounds(700, 350, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product9 = new JLabel("Blue Berry shake");
        lbl_product9.setFont(fon5);
        lbl_product9.setBounds(700, 510, 190, 40);
        lbl_product9.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product9);

        lbl_productp9 = new JLabel("Price: $16");
        lbl_productp9.setFont(fon6);
        lbl_productp9.setBounds(750, 535, 190, 40);
        lbl_productp9.setForeground(new Color(255, 255, 200));
        panel.add(lbl_productp9);

        btn_product9 = new JButton("Add To Cart");
        btn_product9.setFont(fon1);
        btn_product9.setBackground(new Color(11, 135, 15));
        btn_product9.setBorder(new LineBorder(Color.green, 4));
        btn_product9.setForeground(new Color(255, 255, 255));
        btn_product9.setBounds(700, 572, 190, 50);
        btn_product9.addActionListener(this);
        panel.add(btn_product9);

        product10 = new ImageIcon(Objects.requireNonNull(getClass().getResource("item10.png")));
        lbl_imgpro = new JLabel(product10);
        lbl_imgpro.setBounds(920, 350, 190, 160);
        panel.add(lbl_imgpro);

        lbl_product10 = new JLabel("Green Apple Wine");
        lbl_product10.setFont(fon5);
        lbl_product10.setBounds(920, 510, 190, 40);
        lbl_product10.setForeground(new Color(255, 255, 200));
        panel.add(lbl_product10);

        lbl_productp10 = new JLabel("Price: $18");
        lbl_productp10.setFont(fon6);
        lbl_productp10.setBounds(970, 535, 190, 40);
        lbl_productp10.setForeground(new Color(255, 255, 200));
        panel.add(lbl_productp10);

        btn_product10 = new JButton("Add To Cart");
        btn_product10.setFont(fon1);
        btn_product10.setBackground(new Color(11, 135, 15));
        btn_product10.setBorder(new LineBorder(Color.green, 4));
        btn_product10.setForeground(new Color(255, 255, 255));
        btn_product10.setBounds(920, 572, 190, 50);
        btn_product10.addActionListener(this);
        panel.add(btn_product10);


    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_product1) {
            String username = user;
            String product_1 = lbl_product1.getText();
            String product_p1 = lbl_productp1.getText();

            System.out.println(product_1);
            System.out.println(product_p1);

            productData user = new productData(username, product_1, product_p1);

            DbOperation db = new DbOperation();
            String query = "insert into product(username,product_name,price)"
                    + " values('" + user.getUsername() + "','" + user.getProduct_1() + "','" + user.getProduct_p1() + "')";

            int ans = db.insert(query);
            if (ans > 0) {
                JOptionPane.showMessageDialog(btn_product1, "Juice added to cart!");
            }

        }
        else if (e.getSource() == btn_product2) {
            String username = user;
            String product_2 = lbl_product2.getText();
            String product_p2 = lbl_productp2.getText();

            System.out.println(product_2);
            System.out.println(product_p2);

            productData user = new productData(username, product_2, product_p2);

            DbOperation db = new DbOperation();
            String query = "insert into product(username,product_name,price)"
                    + " values('" + user.getUsername() + "','" + user.getProduct_1() + "','" + user.getProduct_p1() + "')";

            int ans = db.insert(query);
            if (ans > 0) {
                JOptionPane.showMessageDialog(btn_product1, "Juice added to cart!");
            }


        }

        else if (e.getSource() == btn_product3) {
            String username = user;
            String product_3 = lbl_product3.getText();
            String product_p3 = lbl_productp3.getText();

            System.out.println(product_3);
            System.out.println(product_p3);

            productData user = new productData(username, product_3, product_p3);

            DbOperation db = new DbOperation();
            String query = "insert into product(username,product_name,price)"
                    + " values('" + user.getUsername() + "','" + user.getProduct_1() + "','" + user.getProduct_p1() + "')";

            int ans = db.insert(query);
            if (ans > 0) {
                JOptionPane.showMessageDialog(btn_product1, "Juice added to cart!");
            }


        }

        else if (e.getSource() == btn_product4) {
            String username = user;
            String product_4 = lbl_product4.getText();
            String product_p4 = lbl_productp4.getText();

            System.out.println(product_4);
            System.out.println(product_p4);

            productData user = new productData(username, product_4, product_p4);

            DbOperation db = new DbOperation();
            String query = "insert into product(username,product_name,price)"
                    + " values('" + user.getUsername() + "','" + user.getProduct_1() + "','" + user.getProduct_p1() + "')";

            int ans = db.insert(query);
            if (ans > 0) {
                JOptionPane.showMessageDialog(btn_product1, "Juice added to cart!");
            }


        }

        else if (e.getSource() == btn_product5) {
            String username = user;
            String product_5 = lbl_product5.getText();
            String product_p5 = lbl_productp5.getText();

            System.out.println(product_5);
            System.out.println(product_p5);

            productData user = new productData(username, product_5, product_p5);

            DbOperation db = new DbOperation();
            String query = "insert into product(username,product_name,price)"
                    + " values('" + user.getUsername() + "','" + user.getProduct_1() + "','" + user.getProduct_p1() + "')";

            int ans = db.insert(query);
            if (ans > 0) {
                JOptionPane.showMessageDialog(btn_product1, "Juice added to cart!");
            }


        }

        else if (e.getSource() == btn_product6) {
            String username = user;
            String product_6 = lbl_product6.getText();
            String product_p6 = lbl_productp6.getText();

            System.out.println(product_6);
            System.out.println(product_p6);

            productData user = new productData(username, product_6, product_p6);

            DbOperation db = new DbOperation();
            String query = "insert into product(username,product_name,price)"
                    + " values('" + user.getUsername() + "','" + user.getProduct_1() + "','" + user.getProduct_p1() + "')";

            int ans = db.insert(query);
            if (ans > 0) {
                JOptionPane.showMessageDialog(btn_product1, "Juice added to cart!");
            }


        }

        else if (e.getSource() == btn_product7) {
            String username = user;
            String product_7 = lbl_product7.getText();
            String product_p7 = lbl_productp7.getText();

            System.out.println(product_7);
            System.out.println(product_p7);

            productData user = new productData(username, product_7, product_p7);

            DbOperation db = new DbOperation();
            String query = "insert into product(username,product_name,price)"
                    + " values('" + user.getUsername() + "','" + user.getProduct_1() + "','" + user.getProduct_p1() + "')";

            int ans = db.insert(query);
            if (ans > 0) {
                JOptionPane.showMessageDialog(btn_product1, "Juice added to cart!");
            }


        }

        else if (e.getSource() == btn_product8) {
            String username = user;
            String product_8 = lbl_product8.getText();
            String product_p8 = lbl_productp8.getText();

            System.out.println(product_8);
            System.out.println(product_p8);

            productData user = new productData(username, product_8, product_p8);

            DbOperation db = new DbOperation();
            String query = "insert into product(username,product_name,price)"
                    + " values('" + user.getUsername() + "','" + user.getProduct_1() + "','" + user.getProduct_p1() + "')";

            int ans = db.insert(query);
            if (ans > 0) {
                JOptionPane.showMessageDialog(btn_product1, "Juice added to cart!");
            }


        }
        else if (e.getSource() == btn_product9) {
            String username = user;
            String product_9 = lbl_product9.getText();
            String product_p9 = lbl_productp9.getText();

            System.out.println(product_9);
            System.out.println(product_p9);

            productData user = new productData(username, product_9, product_p9);

            DbOperation db = new DbOperation();
            String query = "insert into product(username,product_name,price)"
                    + " values('" + user.getUsername() + "','" + user.getProduct_1() + "','" + user.getProduct_p1() + "')";

            int ans = db.insert(query);
            if (ans > 0) {
                JOptionPane.showMessageDialog(btn_product1, "Juice added to cart!");
            }


        }

        else if (e.getSource() == btn_product10) {
            String username = user;
            String product_10 = lbl_product10.getText();
            String product_p10 = lbl_productp10.getText();

            System.out.println(product_10);
            System.out.println(product_p10);

            productData user = new productData(username, product_10, product_p10);

            DbOperation db = new DbOperation();
            String query = "insert into product(username,product_name,price)"
                    + " values('" + user.getUsername() + "','" + user.getProduct_1() + "','" + user.getProduct_p1() + "')";

            int ans = db.insert(query);
            if (ans > 0) {
                JOptionPane.showMessageDialog(btn_product1, "Juice added to cart!");
            }


        }

    }

}

