package Employee_Mangement_System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash extends JFrame implements ActionListener {
    Splash(){
        getContentPane().setBackground(Color.WHITE);
        setSize(1170,650);
        setLocation(150,50);
        setLayout(null);
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setFont(new Font("serif", Font.PLAIN,60));
        heading.setBounds(70,20,1200,60);
        heading.setForeground(Color.cyan);
        add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(50,95,1060,500);
        add(Image);

        JButton Clickhere = new JButton("Click Here to Continue");
        Clickhere.setBounds(400,400,300,70);
        Clickhere.setFont(new Font("serif", Font.PLAIN,20));
        Clickhere.setForeground(Color.BLACK);
        Clickhere.setBackground(Color.lightGray);
        Clickhere.addActionListener(this);
        Image.add(Clickhere);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        while (true){
            heading.setVisible(false);
            try {
                Thread.sleep(500);
            }catch (Exception e){

            }
            heading.setVisible(true);
            try {
                Thread.sleep(500);
            }catch (Exception e){

            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();
    }
    public static void main(String [] args){

        new Splash();
    }
}
