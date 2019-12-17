package com.ashabacon;

import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("Connect Four");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(new KinectFour());
        window.pack();
        window.setSize(400, 400);
        window.setVisible(true);
    }
}
