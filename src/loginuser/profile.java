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
    Font fon1,fon2,fon3,fon4;
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
        fon4=new Font("algerian",Font.BOLD,45);



        lbl_profile_heading = new JLabel("Account Settings");
        lbl_profile_heading.setFont(fon4);
        lbl_profile_heading.setForeground(new Color(255, 255, 255));
        lbl_profile_heading.setBounds(210, 100, 800, 50);
        panel.add(lbl_profile_heading);

        lbl_fname = new JLabel("First name :");
        lbl_fname.setFont(fon2);
        lbl_fname.setForeground(new Color(255, 255, 255));
        lbl_fname.setBounds(250, 200, 150, 40);
        panel.add(lbl_fname);

        lbl_lname = new JLabel("Last name :");
        lbl_lname.setFont(fon2);
        lbl_lname.setForeground(new Color(255, 255, 255));
        lbl_lname.setBounds(250, 240, 300, 50);
        panel.add(lbl_lname);

        lbl_email = new JLabel("Email :");
        lbl_email.setFont(fon2);
        lbl_email.setForeground(new Color(255, 255, 255));
        lbl_email.setBounds(250, 280, 300, 50);
        panel.add(lbl_email);

        lbl_gender = new JLabel("Gender :");
        lbl_gender.setFont(fon2);
        lbl_gender.setForeground(new Color(255, 255, 255));
        lbl_gender.setBounds(250, 320, 300, 50);
        panel.add(lbl_gender);

        regMale = new JRadioButton("Male");
        regMale.setForeground(new Color(255, 255, 255));
        regMale.setBounds(490, 326, 80, 30);
        regMale.setFont(fon2);
        regFemale = new JRadioButton("Female");
        regFemale.setForeground(new Color(255, 255, 255));
        regFemale.setBounds(590, 326, 100, 30);
        regFemale.setFont(fon2);
        ButtonGroup bg = new ButtonGroup();
        bg.add(regMale);
        bg.add(regFemale);
        panel.add(regMale);
        panel.add(regFemale);


        lbl_pass = new JLabel("Password :");
        lbl_pass.setFont(fon2);
        lbl_pass.setForeground(new Color(255, 255, 255));
        lbl_pass.setBounds(250, 360, 300, 50);
        panel.add(lbl_pass);



        lbl_cpass = new JLabel("Confirm Password :");
        lbl_cpass.setFont(fon2);
        lbl_cpass.setForeground(new Color(255, 255, 255));
        lbl_cpass.setBounds(250, 400, 300, 50);
        panel.add(lbl_cpass);


        String username=user;
        DbOperation db=new DbOperation();
        String query="select * from registration_tbl where username='"+username+"'";
        ResultSet rs=db.select(query);
        try {
            while (rs.next())
            {
                txt_fname = new JTextField(rs.getString("fname"));
                txt_fname.setFont(fon2);
                txt_fname.setBackground(new Color(220, 239, 238));
                txt_fname.setBounds(490, 203, 200, 35);
                panel.add(txt_fname);

                txt_lname = new JTextField(rs.getString("lname"));
                txt_lname.setFont(fon2);
                txt_lname.setBackground(new Color(220, 239, 238));
                txt_lname.setBounds(490, 203, 200, 35);
                panel.add(txt_lname);

                txt_username = new JTextField(rs.getString("username"));
                txt_username.setFont(fon2);
                txt_username.setBackground(new Color(220, 239, 238));
                txt_username.setBounds(490, 243, 200, 35);
                panel.add(txt_username);

                txt_email = new JTextField(rs.getString("email"));
                txt_email.setFont(fon2);
                txt_email.setBackground(new Color(220, 239, 238));
                txt_email.setBounds(490, 283, 200, 35);
                panel.add(txt_email);

                String gender=rs.getString("gender");

                if (gender.length()==4 ) {
                    System.out.println("male");
                    regMale.setSelected(true);
                }
                else{
                    regFemale.setSelected(true);
                    System.out.println("female");

                }

                txt_pass = new JPasswordField(rs.getString("password"));
                txt_pass.setFont(fon2);
                txt_pass.setBackground(new Color(220, 239, 238));
                txt_pass.setBounds(490, 363, 200, 35);
                panel.add(txt_pass);

                txt_cpass = new JPasswordField(rs.getString("cpassword"));
                txt_cpass.setFont(fon2);
                txt_cpass.setBackground(new Color(220, 239, 238));
                txt_cpass.setBounds(490, 403, 200, 35);
                panel.add(txt_cpass);
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
        btn_update.setBounds(320,510,200,50);
        btn_update.addActionListener(this);
        panel.add(btn_update);

        imageprofile_bg = new ImageIcon(Objects.requireNonNull(getClass().getResource("profile_bg.png")));
        lbl_imgpro = new JLabel(imageprofile_bg);
        lbl_imgpro.setBounds(0, 0, 1095, 640);
        panel.add(lbl_imgpro);

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
                String query="update registration_tbl set fname='"+txt_fname.getText()+"', lname='"+txt_lname.getText()+"',"
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
