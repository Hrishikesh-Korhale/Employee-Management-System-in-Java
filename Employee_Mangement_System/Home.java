package Employee_Mangement_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {
    JButton add, view, update, remove;
    Home(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100,700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel bgimg = new JLabel(i3);
        bgimg.setBounds(0,0,1120,630);
        add(bgimg);

        JLabel heading = new JLabel("Employee Management System");
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        heading.setBounds(630,20,400,40);
        bgimg.add(heading);

        add = new JButton("Add Employee");
        add.setBounds(650,80,150,40);
        add.addActionListener(this);
        bgimg.add(add);

        view = new JButton("View Employee");
        view.setBounds(820,80,150,40);
        view.addActionListener(this);
        bgimg.add(view);

        update = new JButton("Update Employee");
        update.setBounds(650,140,150,40);
        update.addActionListener(this);
        bgimg.add(update);

        remove = new JButton("Remove Employee");
        remove.setBounds(820,140,150,40);
        remove.addActionListener(this);
        bgimg.add(remove);

        setSize(1120,630);
        setLocation(120,80);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){
            setVisible(false);
            new AddEmployee();
        } else if (e.getSource() == view) {
            setVisible(false);
            new ViewEmployee();

        } else if (e.getSource() == update) {
            setVisible(false);
            new ViewEmployee();

        }else if (e.getSource() == remove){
            setVisible(false);
            new RemoveEmployee();
        }
    }
    public static void main(String [] args){
        new Home();
    }
}
