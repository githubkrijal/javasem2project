package loginuser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.util.Objects;
import javax.swing.border.LineBorder;

public class LoginPage implements ActionListener {
    JFrame fr;
    JLabel lbl_heading,lbl_username,lbl_password,lbl_img;
    JTextField txt_username;
    JPasswordField txt_password;
    JButton btn_login,btn_reg;
    Font fon1,fon2,fon3;
    JPanel panel;
    ImageIcon image_bg;
    public LoginPage(){
        fr=new JFrame("Login Page");
        fon1=new Font("algerian",Font.BOLD,45);
        fon2=new Font("areal",Font.BOLD,20);
        fon3=new Font("areal",Font.BOLD,30);

        lbl_heading=new JLabel("Get yourself a juicy juice!");
        lbl_heading.setFont(fon1);
        lbl_heading.setBounds(290,200,600,60);
        lbl_heading.setForeground(new Color(255,255,255));
        fr.add(lbl_heading);

        panel= new JPanel();
        panel.setBounds(0,0,1440,805);
        panel.setBackground(new Color(61,3,132));
        panel.setLayout(null);
        fr.add(panel);

        lbl_username=new JLabel("User Name :");
        lbl_username.setForeground(new Color(255,255,255));
        lbl_username.setFont(fon2);
        lbl_username.setBounds(250,305,150,40);
        panel.add(lbl_username);

        txt_username=new JTextField();
        txt_username.setFont(fon2);
        txt_username.setBackground(new Color(220,239,238));
        txt_username.setBounds(400,308,230,40);
        panel.add(txt_username);

        lbl_password=new JLabel("Password  :");
        lbl_password.setForeground(new Color(255,255,255));
        lbl_password.setFont(fon2);
        lbl_password.setBounds(250,360,150,40);
        panel.add(lbl_password);

        txt_password=new JPasswordField();
        txt_password.setFont(fon2);
        txt_password.setBackground(new Color(220,239,238));
        txt_password.setBounds(400,363,230,40);
        txt_password.setBackground(new Color(220,239,238));
        panel.add(txt_password);

        btn_login=new JButton("LOGIN");
        btn_login.setFont(fon3);
        btn_login.setBackground(new Color(11,135,15));
        btn_login.setBorder(new LineBorder(Color.green,4));
        btn_login.setForeground(new Color(255,255,255));
        btn_login.setBounds(420,415,190,50);
        btn_login.addActionListener(this);
        panel.add(btn_login);

        btn_reg=new JButton("Sign up");
        btn_reg.setForeground(Color.white);
        btn_reg.setBackground(new Color(253,48,48));
        btn_reg.setBorder(new LineBorder(Color.red,4));
        btn_reg.setFont(fon2);
        btn_reg.setBounds(600,550,150,40);
        btn_reg.addActionListener(this);
        panel.add(btn_reg);

        lbl_password=new JLabel("Need an account? Sign up here:");
        lbl_password.setForeground(new Color(255,255,255));
        lbl_password.setFont(fon2);
        lbl_password.setBounds(250,550,450,40);
        panel.add(lbl_password);

        image_bg=new ImageIcon(Objects.requireNonNull(getClass().getResource("loginpic1.png")));
        lbl_img=new JLabel(image_bg);
        lbl_img.setBounds(0,0,1400,750);
        panel.add(lbl_img);



        fr.setSize(1440,805);
        fr.setLayout(null);
        fr.setVisible(true);
    }

    public boolean log_test(String username, String password) {
        String username_test="krijal";
        String pass_test="k123";
        boolean result = false;
        if (username== username_test && password == pass_test) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        new LoginPage();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn_reg) {
            fr.dispose();
            new registrationPage();
        }

        else if (e.getSource()==btn_login) {
            String username=txt_username.getText();
            String password=txt_password.getText();
            String query="select * from registration_tbl where username ='"+username+"' and password='"+password+"'";
            DbOperation db=new DbOperation();
            ResultSet rs=db.select(query);

            try {
                if(rs.next()) {
                    String gender = rs.getString(5);
                    String fname = rs.getString(2);
                    JOptionPane.showMessageDialog(btn_login, "Login successful!");
                    fr.dispose();

                    new MainPage(username, gender, fname);
                }
                else if(username.length()==0 && password.length()==0) {
                    JOptionPane.showMessageDialog(btn_login, "Please fill both fields.");
                }
                else {
                    JOptionPane.showMessageDialog(btn_login, "Your username or password do not match.");
                }
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }


}
