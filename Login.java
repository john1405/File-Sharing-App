/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.file_sharing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1, b2, b3;
    JLabel Background;

    Login() {

        //Move the text to the center
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("WELCOME TO FILE SHARING APP");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z / y;
        String pad = "";
        //for (int i=0; i!=w; i++) pad +=" ";
        pad = String.format("%" + w + "s", pad);
        setTitle(pad + "WELCOME TO FILE SHARING APP");

        l1 = new JLabel("FILE SHARING APP");
        l1.setFont(new Font("Osward", Font.BOLD, 38));

        l2 = new JLabel("USERNAME:");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));

        l3 = new JLabel("PASSWORD:");
        l3.setFont(new Font("Raleway", Font.BOLD, 28));

        tf1 = new JTextField(15);
        pf2 = new JPasswordField(15);

        b1 = new JButton("SIGN IN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("FORGET PASSWORD");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        b3 = new JButton("SIGN UP");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);

        setLayout(null);

        l1.setBounds(175, 50, 450, 200);
        add(l1);

        l2.setBounds(125, 150, 375, 200);
        add(l2);

        l3.setBounds(125, 225, 375, 200);
        add(l3);

        tf1.setBounds(300, 235, 230, 30);
        add(tf1);

        tf1.setFont(new Font("Arial", Font.BOLD, 14));

        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(300, 310, 230, 30);
        add(pf2);

        b1.setFont(new Font("Arial", Font.BOLD, 13));
        b1.setBounds(300, 400, 100, 30);
        b1.setBackground(Color.green);
        add(b1);

        b2.setFont(new Font("Arial", Font.BOLD, 13));
        b2.setBounds(410, 400, 170, 30);
        b2.setBackground(Color.red);
        add(b2);

        b3.setFont(new Font("Arial", Font.BOLD, 13));
        b3.setBounds(300, 450, 280, 30);
        b3.setBackground(Color.green);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        ImageIcon img = new ImageIcon("\"C:\\\\Users\\\\HIMANSHU SINGH\\\\Desktop\\\\him.jpg");
        Background = new JLabel("", img, JLabel.CENTER);
        Background.setBounds(0, 0, 750, 750);
        add(Background);

        //getContentPane().setBackground(Color.white);
        setSize(750, 750);
        setLocation(500, 200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
