package loginuser;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.border.LineBorder;

public class MainPage implements ActionListener{
    JFrame fr;
    JPanel panel,panel1,panel2,panel_purchase,panel_profile,panel_cart,panel_order;
    Font fon1,fon2,fon3,fon4;
    ImageIcon image_bg,gender_pic;
    JLabel lbl_img,lbl_topic,lbl_gender_pic,lbl_welcome;
    JButton btn_purchase,btn_profile,btn_cart,btn_logout,btn_order;
    String user;

    public MainPage(String user, String gender,String fname){
        this.user=user;
        fr=new JFrame();
        fon1=new Font("algerian",Font.BOLD,50);
        fon2=new Font("algerian",Font.BOLD,30);
        fon3=new Font("algerian",Font.BOLD,40);
        fon4=new Font("algerian",Font.BOLD,60);


        //Main/whole panel
        panel= new JPanel();
        panel.setBounds(0,0,1440,805);
        panel.setLayout(null);
        fr.add(panel);

        //Logo
        panel1= new JPanel();
        panel1.setBounds(490,10,450,70);
        panel1.setBackground(new Color(100,63,150));
        panel1.setLayout(null);
        panel.add(panel1);

        //sub display panel
        panel2= new JPanel();
        panel2.setBounds(265,0,1175,805);
        panel2.setBackground(new Color(68,2,150));
        panel2.setLayout(null);
        panel.add(panel2);

        lbl_welcome= new JLabel(" " +fname );
        lbl_welcome.setBounds(980,9,500,50);
        lbl_welcome.setFont(fon2);
        lbl_welcome.setForeground(new Color(255,255,255));
        panel2.add(lbl_welcome);

        //gender picture switch
        System.out.println(gender);

        String male="Male";
        if (gender.equals(male)) {
            //gender_img="Mr";
            gender_pic=new ImageIcon(getClass().getResource("male.png"));
            lbl_gender_pic=new JLabel(gender_pic);
            lbl_gender_pic.setBounds(920,7,60,60);
            panel2.add(lbl_gender_pic);

        }
        else {
            //gender_img="Mrs";
            gender_pic=new ImageIcon(getClass().getResource("female.png"));
            lbl_gender_pic=new JLabel(gender_pic);
            lbl_gender_pic.setBounds(920,7,60,60);
            panel2.add(lbl_gender_pic);
        }


        lbl_topic=new JLabel("Juice Factory");
        lbl_topic.setBounds(60,0,450,70);
        lbl_topic.setFont(fon1);
        panel1.add(lbl_topic);

        //Buttons
        btn_purchase=new JButton("Home");
        btn_purchase.setFont(fon3);
        btn_purchase.setBorder(new LineBorder(Color.green,4));
        btn_purchase.setForeground(new Color(255,255,255));
        btn_purchase.setForeground(new Color(5,188,5));
        btn_purchase.setBounds(30,100,190,50);
        btn_purchase.addActionListener(this);
        panel.add(btn_purchase);

        panel_purchase= new JPanel();
        panel_purchase.setLayout(null);
        panel_purchase.setLocation(0, 0);
        panel_purchase.setBounds(0,100,1175,705);
        panel_purchase.setBackground(new Color(68,2,150));
        panel2.add(panel_purchase);
        new homepage(panel_purchase,user);

        btn_cart=new JButton("Cart");
        btn_cart.setFont(fon3);
        btn_cart.setBackground(new Color(11,135,15));
        btn_cart.setBorder(new LineBorder(Color.green,4));
        btn_cart.setForeground(new Color(255,255,255));
        btn_cart.setBounds(30,200,190,50);
        btn_cart.addActionListener(this);
        panel.add(btn_cart);

        panel_cart= new JPanel();
        panel_cart.setLayout(null);
        panel_cart.setLocation(0, 0);
        panel_cart.setBounds(0,100,1175,705);
        panel_cart.setBackground(new Color(68,2,150));
        panel2.add(panel_cart);


        btn_profile=new JButton("Profile");
        btn_profile.setFont(fon3);
        btn_profile.setBackground(new Color(11,135,15));
        btn_profile.setBorder(new LineBorder(Color.green,4));
        btn_profile.setForeground(new Color(255,255,255));
        btn_profile.setBounds(30,300,190,50);
        btn_profile.addActionListener(this);
        panel.add(btn_profile);

        //profile panel on top of panel 2
        panel_profile= new JPanel();
        panel_profile.setLayout(null);
        panel_profile.setLocation(0,0);
        panel_profile.setBounds(0,100,1095,640);
        panel_profile.setBackground(new Color(68,2,150));
        panel2.add(panel_profile);

        btn_order=new JButton("Orders");
        btn_order.setFont(fon3);
        btn_order.setBackground(new Color(11,135,15));
        btn_order.setBorder(new LineBorder(Color.green,4));
        btn_order.setForeground(new Color(255,255,255));
        btn_order.setBounds(30,400,190,50);
        btn_order.addActionListener(this);
        panel.add(btn_order);

        panel_order= new JPanel();
        panel_order.setLayout(null);
        panel_order.setLocation(0, 0);
        panel_order.setBounds(0,100,1175,705);
        panel_order.setBackground(new Color(68,2,150));
        panel2.add(panel_order);


        btn_logout = new JButton("Logout");
        btn_logout.setFont(fon2);
        btn_logout.setBackground(new Color(255, 0, 0));
        btn_logout.setBorder(new LineBorder(Color.red, 4));
        btn_logout.setForeground(new Color(255, 255, 255));
        btn_logout.setBounds(30, 650, 190, 45);
        btn_logout.addActionListener(this);
        panel.add(btn_logout);



        image_bg=new ImageIcon(getClass().getResource("main_bg3.png"));
        lbl_img=new JLabel(image_bg);
        lbl_img.setBounds(0,0,1440,805);
        panel.add(lbl_img);


        fr.setSize(1440,805);
        fr.setLayout(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn_purchase) {
            panel_profile.setBounds(0,0,0,0);
            panel_cart.setBounds(0,0,0,0);
            panel_order.setBounds(0,0,0,0);
            panel_purchase.setBounds(0,100,1175,705);
            btn_profile.setForeground(Color.white);
            btn_purchase.setForeground(new Color(5,188,5));
            btn_cart.setForeground(Color.white);
            btn_order.setForeground(Color.white);
            new homepage(panel_purchase,user);
        }

        else if(e.getSource()==btn_cart) {
            panel_purchase.setBounds(0,0,0,0);
            panel_profile.setBounds(0,0,0,0);
            panel_order.setBounds(0,0,0,0);
            panel_cart.setBounds(0,100,1175,600);
            btn_purchase.setForeground(new Color(255,255,255));
            btn_profile.setForeground(new Color(255,255,255));
            btn_cart.setForeground(new Color(5,188,5));
            btn_order.setForeground(Color.white);
            panel_cart.removeAll();
            panel_cart.repaint();
            panel_cart.revalidate();
            new cart(panel_cart,user);
        }

        else if(e.getSource()==btn_profile){

            panel_purchase.setBounds(0,0,0,0);
            panel_cart.setBounds(0,0,0,0);
            panel_order.setBounds(0,0,0,0);
            panel_profile.setBounds(0,100,1175,705);
            btn_profile.setForeground(new Color(5,188,5));
            btn_cart.setForeground(Color.white);
            btn_order.setForeground(Color.white);
            btn_purchase.setForeground(Color.white);
            new profile(panel_profile,user);
        }

        else if(e.getSource()==btn_order) {
            panel_purchase.setBounds(0,0,0,0);
            panel_profile.setBounds(0,0,0,0);
            panel_cart.setBounds(0,0,0,0);
            panel_order.setBounds(0,100,1175,600);
            btn_purchase.setForeground(new Color(255,255,255));
            btn_profile.setForeground(new Color(255,255,255));
            btn_order.setForeground(new Color(5,188,5));
            btn_cart.setForeground(Color.white);
            new orders(panel_order,user);
        }

        else if (e.getSource() == btn_logout) {
            fr.dispose();
            new LoginPage();
            {
                JOptionPane.showMessageDialog(fr, "You logged out");
            }
        }

    }
}

