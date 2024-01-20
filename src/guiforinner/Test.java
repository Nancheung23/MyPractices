package com.nancheung.guiforinner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        JFrame win = new JFrame("Login Interface");
        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("Login");
        win.add(btn);

//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(win,"Login!!!");
//            }
//        });

        // lambda
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "Login!!!"));

        win.setSize(400, 400);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}
