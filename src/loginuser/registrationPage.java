package loginuser;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class registrationPage implements ActionListener {
    JFrame fr;
    JLabel lbl_heading, lbl_fname, lbl_lname, lbl_email, lbl_pass, lbl_cpass, lbl_img, lbl_gender, lbl_username,lbl_backl, lbl_agree;
    JTextField txt_fname, txt_lname, txt_email, txt_username;
    JPasswordField txt_pass, txt_cpass;
    JButton btn_register, btn_return;
    Font fon1, fon2, fon3;
    JPanel panel;
    ImageIcon image_bg;
    JCheckBox agree;
    JRadioButton regMale, regFemale;

    public registrationPage() {
        fr = new JFrame("Registration");
        fon1 = new Font("areal", Font.BOLD, 30);
        fon2 = new Font("areal", Font.BOLD, 18);
        fon3 = new Font("algerian", Font.BOLD, 45);


        panel = new JPanel();
        panel.setBounds(0,0,1440,805);
        panel.setBackground(new Color(61,3,132));
        panel.setLayout(null);
        fr.add(panel);


        lbl_heading = new JLabel("Let's make an account!");
        lbl_heading.setFont(fon3);
        lbl_heading.setForeground(new Color(255, 255, 255));
        lbl_heading.setBounds(300, 155, 600, 60);
        panel.add(lbl_heading);

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

        lbl_agree = new JLabel("I agree to all the terms and conditions :");
        lbl_agree.setFont(fon2);
        lbl_agree.setForeground(new Color(255, 255, 255));
        lbl_agree.setBounds(250, 512, 500, 50);
        panel.add(lbl_agree);

        agree = new JCheckBox(" ");
        agree.setFont(fon2);
        agree.setForeground(new Color(255,255,255));
        agree.setBounds(660,522,370,30);
        panel.add(agree);


        btn_register = new JButton("Register");
        btn_register.setFont(fon1);
        btn_register.setBackground(new Color(11, 135, 15));
        btn_register.setBorder(new LineBorder(Color.green, 4));
        btn_register.setForeground(new Color(255, 255, 255));
        btn_register.setBounds(400, 575, 200, 45);
        btn_register.addActionListener(this);
        panel.add(btn_register);

        lbl_backl = new JLabel("Got an account now?");
        lbl_backl.setFont(fon2);
        lbl_backl.setForeground(new Color(255, 255, 255));
        lbl_backl.setBounds(350, 630, 500, 50);
        panel.add(lbl_backl);

        btn_return = new JButton("Login");
        btn_return.setFont(fon2);
        btn_return.setBackground(new Color(255, 0, 0));
        btn_return.setBorder(new LineBorder(Color.green, 4));
        btn_return.setForeground(new Color(255, 255, 255));
        btn_return.setBounds(570, 640, 150, 27);
        btn_return.addActionListener(this);
        panel.add(btn_return);


        image_bg = new ImageIcon(Objects.requireNonNull(getClass().getResource("registrationpic.png")));
        lbl_img = new JLabel(image_bg);
        lbl_img.setBounds(0, 0, 1400, 750);
        panel.add(lbl_img);

        fr.setSize(1440,805);
        fr.setLayout(null);
        fr.setVisible(true);

    }

    public static void main(String[] args) {
        new registrationPage();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_return) {
            fr.dispose();
            new LoginPage();

        }
        else if (e.getSource() == btn_register) {


            String fname = txt_fname.getText();
            String lname = txt_lname.getText();
            String username = txt_username.getText();
            String email = txt_email.getText();

            String gender="";
            if (regMale.isSelected()) {
                gender=regMale.getText();
            }
            if(regFemale.isSelected()) {
                gender=regFemale.getText();
            }
            String pass = txt_pass.getText();
            String cpass = txt_pass.getText();

            System.out.println(fname);
            System.out.println(lname);
            System.out.println(email);
            System.out.println(username);
            System.out.println(gender);
            System.out.println(pass);
            System.out.println(cpass);
            System.out.println(fname.length());

            userData user= new userData(fname,lname,username,email,gender,pass,cpass);


            if (user.getUsername().length()==0 || user.getFname().length()==0 || user.getLname().length()==0 || user.getEmail().length()==0
                    || regMale.isSelected()==false && regFemale.isSelected()==false
                    || user.getPass().length()==0 || user.getcPass().length()==0)
            {
                JOptionPane.showMessageDialog(btn_register, "Enter all Fields completely");
            }
            else if(user.getPass().equals(user.getcPass()) != true) {
                JOptionPane.showMessageDialog(btn_register, "Your password and confirm password did not match.");
            }
            else if(agree.isSelected()==false) {
                JOptionPane.showMessageDialog(btn_register, "Please agree the terms and condition.");
            }
            else  {
                DbOperation db=new DbOperation();
                String query="insert into registration_tbl(fname,lname,username,email,gender,password,cpassword)"
                        + " values('"+user.getFname()+"','"+user.getLname()+"','"+user.getUsername()+"','"+user.getEmail()+"','"+user.getGender()+"','"+user.getPass()+"','"+user.getcPass()+"')";


                int ans = db.insert(query);
                if (ans > 0) {
                    JOptionPane.showMessageDialog(fr, "User successfully registered");
                    txt_fname.setText("");
                    txt_lname.setText("");
                    txt_username.setText("");
                    txt_email.setText("");
                    txt_pass.setText("");
                    txt_cpass.setText("");
                    agree.setSelected(false);
                    ButtonGroup bg=new ButtonGroup();
                    bg.add(regMale);
                    bg.add(regFemale);
                    panel.add(regMale);
                    panel.add(regFemale);
                    bg.clearSelection();
                } else {
                    JOptionPane.showMessageDialog(fr, "Username has already been taken. Please try a different username");
                }


            }
        }
    }
}











/*
package loginDemo;

        import java.awt.Color;
        import java.awt.Font;

        import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JLabel;
        import javax.swing.JPanel;
        import javax.swing.JPasswordField;
        import javax.swing.JTextField;

public class RegisterPAge {
    JFrame fr;
    JLabel lbl_heading,lbl_fname,lbl_lname,lbl_email,lbl_pass,lbl_cpss;
    JTextField txt_fname,txt_lname,txt_email;
    JPasswordField txt_pass,txt_cpss;
    JButton btn_register;
    Font fon1,fon2;
    JPanel panel;
    public RegisterPAge() {
        fr=new JFrame("Registeration");
        fon1=new Font("areal",Font.BOLD,30);
        fon2=new Font("areal",Font.BOLD,18);
        lbl_heading=new JLabel("User Registration");
        lbl_heading.setFont(fon1);
        lbl_heading.setBounds(150,30,300,50);
        lbl_heading.setForeground(Color.red);
        fr.add(lbl_heading);

        panel= new JPanel();
        panel.setBounds(10,80,500,350);
        panel.setBackground(Color.cyan);
        panel.setLayout(null);
        fr.add(panel);

        lbl_fname=new JLabel("First name:");
        lbl_fname.setFont(fon2);
        lbl_fname.setBounds(50,80,300,50);
        panel.add(lbl_fname);

        txt_fname=new JTextField();
        txt_fname.setFont(fon2);
        txt_fname.setBounds(260,85,200,35);
        panel.add(txt_fname);

        lbl_lname=new JLabel("Last name:");
        lbl_lname.setFont(fon2);
        lbl_lname.setBounds(50,120,300,50);
        panel.add(lbl_lname);

        txt_lname=new JTextField();
        txt_lname.setFont(fon2);
        txt_lname.setBounds(260,125,200,35);
        panel.add(txt_lname);

        lbl_email=new JLabel("Email:");
        lbl_email.setFont(fon2);
        lbl_email.setBounds(50,160,300,50);
        panel.add(lbl_email);

        txt_email=new JTextField();
        txt_email.setFont(fon2);
        txt_email.setBounds(260,165,200,35);
        panel.add(txt_email);

        lbl_pass=new JLabel("Password:");
        lbl_pass.setFont(fon2);
        lbl_pass.setBounds(50,200,300,50);
        panel.add(lbl_pass);

        txt_pass=new JPasswordField();
        txt_pass.setFont(fon2);
        txt_pass.setBounds(260,205,200,35);
        panel.add(txt_pass);

        lbl_cpss=new JLabel("Confirm Password:");
        lbl_cpss.setFont(fon2);
        lbl_cpss.setBounds(50,240,300,50);
        panel.add(lbl_cpss);

        txt_cpss=new JPasswordField();
        txt_cpss.setFont(fon2);
        txt_cpss.setBounds(260,245,200,35);
        panel.add(txt_cpss);

        btn_register=new JButton("Register");
        btn_register.setFont(fon1);
        btn_register.setForeground(Color.green);
        btn_register.setBounds(200,295,200,45);
        panel.add(btn_register);

        fr.setSize(600,600);
        fr.setLayout(null);
        fr.setVisible(true);
        fr.setBackground(Color.YELLOW);

    }
    public static void main(String[] args) {
        new RegisterPAge();
    }
}
*/