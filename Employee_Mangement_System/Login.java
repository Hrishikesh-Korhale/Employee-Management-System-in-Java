package Employee_Mangement_System;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    Login(){
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);
      setSize(600,300);
      setLocation(430,200);

      JLabel usernamelbl = new JLabel("Username");
      usernamelbl.setBounds(40,20,100,30);
      add(usernamelbl);

      JTextField usernameTF = new JTextField();
      usernameTF.setBounds(150,20,150,30);
      add(usernameTF);

      JLabel passwordlbl = new JLabel("Password");
      passwordlbl.setBounds(40,70,100,30);
      add(passwordlbl);

      JPasswordField passwordPF = new JPasswordField();
      passwordPF.setBounds(150,70,150,30);
      add(passwordPF);

      JButton loginbtn = new JButton("Login");
      loginbtn.setForeground(Color.WHITE);
      loginbtn.setBackground(Color.BLACK);
      loginbtn.setBounds(150,120,150,30);
      add(loginbtn);

      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
      Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel Img = new JLabel(i3);
      Img.setBounds(350,0,200,200);
      add(Img);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
    }
    public static void main(String [] args){
        new Login();
    }
}
