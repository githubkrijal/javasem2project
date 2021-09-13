package loginuser;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class profile implements ActionListener {
    Font fon1,fon2,fon3;
    JLabel lbl_profile_heading,lbl_fname, lbl_lname, lbl_username,lbl_email,lbl_gender,lbl_pass,lbl_cpass,lbl_imgpro;
    JTextField txt_fname, txt_lname, txt_username,txt_email,txt_pass,txt_cpass;
    JRadioButton regMale,regFemale;
    ImageIcon imageprofile_bg;
    JButton btn_update;
    String user;
    public profile(JPanel panel,String user) {
        this.user=user;
        fon1=new Font("algerian",Font.BOLD,50);
        fon2=new Font("algerian",Font.BOLD,18);
        fon3=new Font("algerian",Font.BOLD,30);



        lbl_profile_heading = new JLabel("Let's make an account!");
        lbl_profile_heading.setFont(fon3);
        lbl_profile_heading.setForeground(new Color(255, 255, 255));
        lbl_profile_heading.setBounds(300, 155, 600, 60);
        panel.add(lbl_profile_heading);

        lbl_fname = new JLabel("First name :");
        lbl_fname.setFont(fon2);
        lbl_fname.setForeground(new Color(255, 255, 255));
        lbl_fname.setBounds(250, 240, 150, 40);
        panel.add(lbl_fname);

        txt_fname = new JTextField();
        txt_fname.setFont(fon2);
        txt_fname.setBackground(new Color(220, 239, 238));
        txt_fname.setBounds(490, 243, 200, 35);
        panel.add(txt_fname);

        lbl_lname = new JLabel("Last name :");
        lbl_lname.setFont(fon2);
        lbl_lname.setForeground(new Color(255, 255, 255));
        lbl_lname.setBounds(250, 280, 300, 50);
        panel.add(lbl_lname);

        txt_lname = new JTextField();
        txt_lname.setFont(fon2);
        txt_lname.setBackground(new Color(220, 239, 238));
        txt_lname.setBounds(490, 283, 200, 35);
        panel.add(txt_lname);

        lbl_username = new JLabel("Username :");
        lbl_username.setFont(fon2);
        lbl_username.setForeground(new Color(255, 255, 255));
        lbl_username.setBounds(250, 320, 300, 50);
        panel.add(lbl_username);

        txt_username = new JTextField();
        txt_username.setFont(fon2);
        txt_username.setBackground(new Color(220, 239, 238));
        txt_username.setBounds(490, 323, 200, 35);
        panel.add(txt_username);

        lbl_email = new JLabel("Email :");
        lbl_email.setFont(fon2);
        lbl_email.setForeground(new Color(255, 255, 255));
        lbl_email.setBounds(250, 360, 300, 50);
        panel.add(lbl_email);

        txt_email = new JTextField();
        txt_email.setFont(fon2);
        txt_email.setBackground(new Color(220, 239, 238));
        txt_email.setBounds(490, 363, 200, 35);
        panel.add(txt_email);

        lbl_gender = new JLabel("Gender :");
        lbl_gender.setFont(fon2);
        lbl_gender.setForeground(new Color(255, 255, 255));
        lbl_gender.setBounds(250, 400, 300, 50);
        panel.add(lbl_gender);

        regMale = new JRadioButton("Male");
        regMale.setForeground(new Color(255, 255, 255));
        regMale.setBounds(490, 406, 80, 30);
        regMale.setFont(fon2);
        regFemale = new JRadioButton("Female");
        regFemale.setForeground(new Color(255, 255, 255));
        regFemale.setBounds(590, 406, 100, 30);
        regFemale.setFont(fon2);
        ButtonGroup bg = new ButtonGroup();
        bg.add(regMale);
        bg.add(regFemale);
        panel.add(regMale);
        panel.add(regFemale);


        lbl_pass = new JLabel("Password :");
        lbl_pass.setFont(fon2);
        lbl_pass.setForeground(new Color(255, 255, 255));
        lbl_pass.setBounds(250, 440, 300, 50);
        panel.add(lbl_pass);

        txt_pass = new JPasswordField();
        txt_pass.setFont(fon2);
        txt_pass.setBackground(new Color(220, 239, 238));
        txt_pass.setBounds(490, 443, 200, 35);
        panel.add(txt_pass);

        lbl_cpass = new JLabel("Confirm Password :");
        lbl_cpass.setFont(fon2);
        lbl_cpass.setForeground(new Color(255, 255, 255));
        lbl_cpass.setBounds(250, 480, 300, 50);
        panel.add(lbl_cpass);

        txt_cpass = new JPasswordField();
        txt_cpass.setFont(fon2);
        txt_cpass.setBackground(new Color(220, 239, 238));
        txt_cpass.setBounds(490, 483, 200, 35);
        panel.add(txt_cpass);




        imageprofile_bg = new ImageIcon(Objects.requireNonNull(getClass().getResource("profile_bg.png")));
        lbl_imgpro = new JLabel(imageprofile_bg);
        lbl_imgpro.setBounds(0, 0, 1095, 640);
        panel.add(lbl_imgpro);



        String username=user;
        DbOperation db=new DbOperation();
        String query="select * from registration_tbl where username='"+username+"'";
        ResultSet rs=db.select(query);
        try {
            while (rs.next())
            {
                lbl_profile_heading = new JLabel("Let's make an account!");
                lbl_profile_heading.setFont(fon3);
                lbl_profile_heading.setForeground(new Color(255, 255, 255));
                lbl_profile_heading.setBounds(300, 155, 600, 60);
                panel.add(lbl_profile_heading);

                lbl_fname = new JLabel("First name :");
                lbl_fname.setFont(fon2);
                lbl_fname.setForeground(new Color(255, 255, 255));
                lbl_fname.setBounds(250, 240, 150, 40);
                panel.add(lbl_fname);

                txt_fname = new JTextField();
                txt_fname.setFont(fon2);
                txt_fname.setBackground(new Color(220, 239, 238));
                txt_fname.setBounds(490, 243, 200, 35);
                panel.add(txt_fname);

                lbl_lname = new JLabel("Last name :");
                lbl_lname.setFont(fon2);
                lbl_lname.setForeground(new Color(255, 255, 255));
                lbl_lname.setBounds(250, 280, 300, 50);
                panel.add(lbl_lname);

                txt_lname = new JTextField();
                txt_lname.setFont(fon2);
                txt_lname.setBackground(new Color(220, 239, 238));
                txt_lname.setBounds(490, 283, 200, 35);
                panel.add(txt_lname);

                lbl_username = new JLabel("Username :");
                lbl_username.setFont(fon2);
                lbl_username.setForeground(new Color(255, 255, 255));
                lbl_username.setBounds(250, 320, 300, 50);
                panel.add(lbl_username);

                txt_username = new JTextField();
                txt_username.setFont(fon2);
                txt_username.setBackground(new Color(220, 239, 238));
                txt_username.setBounds(490, 323, 200, 35);
                panel.add(txt_username);

                lbl_email = new JLabel("Email :");
                lbl_email.setFont(fon2);
                lbl_email.setForeground(new Color(255, 255, 255));
                lbl_email.setBounds(250, 360, 300, 50);
                panel.add(lbl_email);

                txt_email = new JTextField();
                txt_email.setFont(fon2);
                txt_email.setBackground(new Color(220, 239, 238));
                txt_email.setBounds(490, 363, 200, 35);
                panel.add(txt_email);

                lbl_gender = new JLabel("Gender :");
                lbl_gender.setFont(fon2);
                lbl_gender.setForeground(new Color(255, 255, 255));
                lbl_gender.setBounds(250, 400, 300, 50);
                panel.add(lbl_gender);

                regMale = new JRadioButton("Male");
                regMale.setForeground(new Color(255, 255, 255));
                regMale.setBounds(490, 406, 80, 30);
                regMale.setFont(fon2);
                regFemale = new JRadioButton("Female");
                regFemale.setForeground(new Color(255, 255, 255));
                regFemale.setBounds(590, 406, 100, 30);
                regFemale.setFont(fon2);
                ButtonGroup bg1 = new ButtonGroup();
                bg1.add(regMale);
                bg1.add(regFemale);
                panel.add(regMale);
                panel.add(regFemale);


                lbl_pass = new JLabel("Password :");
                lbl_pass.setFont(fon2);
                lbl_pass.setForeground(new Color(255, 255, 255));
                lbl_pass.setBounds(250, 440, 300, 50);
                panel.add(lbl_pass);

                txt_pass = new JPasswordField();
                txt_pass.setFont(fon2);
                txt_pass.setBackground(new Color(220, 239, 238));
                txt_pass.setBounds(490, 443, 200, 35);
                panel.add(txt_pass);

                lbl_cpass = new JLabel("Confirm Password :");
                lbl_cpass.setFont(fon2);
                lbl_cpass.setForeground(new Color(255, 255, 255));
                lbl_cpass.setBounds(250, 480, 300, 50);
                panel.add(lbl_cpass);

                txt_cpass = new JPasswordField();
                txt_cpass.setFont(fon2);
                txt_cpass.setBackground(new Color(220, 239, 238));
                txt_cpass.setBounds(490, 483, 200, 35);
                panel.add(txt_cpass);

                //

                /*txt_fullname=new JTextField(rs.getString("fullname"));
                txt_fullname.setFont(fon2);
                txt_fullname.setBounds(350,85,170,35);
                txt_fullname.setBackground(new Color(245,254,255));
                panel.add(txt_fullname);

                txt_email=new JTextField(rs.getString("email"));
                txt_email.setFont(fon2);
                txt_email.setBounds(130,145,170,35);
                txt_email.setBackground(new Color(245,254,255));
                panel.add(txt_email);

                String gender=rs.getString("gender");

                if (gender.length()==4 ) {
                    System.out.println("male");
                    rmale.setSelected(true);
                }
                else{
                    rfemale.setSelected(true);
                    System.out.println("female");

                }
                txt_pass=new JTextField(rs.getString("password"));
                txt_pass.setFont(fon2);
                txt_pass.setBounds(130,205,170,35);
                txt_pass.setBackground(new Color(245,254,255));
                panel.add(txt_pass);

                txt_cpss=new JTextField(rs.getString("copassword"));
                txt_cpss.setFont(fon2);
                txt_cpss.setBounds(480,205,170,35);
                txt_cpss.setBackground(new Color(245,254,255));
                panel.add(txt_cpss);*/



            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        btn_update=new JButton("UPDATE");
        btn_update.setForeground(Color.white);
        btn_update.setBackground(new Color(11,135,15));
        btn_update.setBorder(new LineBorder(Color.green,6));
        btn_update.setFont(fon3);
        btn_update.setBounds(300,280,200,50);
        btn_update.addActionListener(this);
        panel.add(btn_update);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn_update) {
            String gender="";
            if (regMale.isSelected()) {
                gender=regMale.getText();
            }
            if(regFemale.isSelected()) {
                gender=regFemale.getText();
            }

            try {
                String query="update register set fname='"+txt_fname.getText()+"',"
                        + "email='"+txt_email.getText()+"',gender='"+gender+"',password='"+txt_pass.getText()+"'"
                        + ",cpassword='"+txt_cpass.getText()+"' where username='"+user+"'";
                DbOperation db=new DbOperation();
                int rs=db.Update(query);
                JOptionPane.showMessageDialog(btn_update, "Update successsful");
            }
            finally{

            }
        }



    }

}
