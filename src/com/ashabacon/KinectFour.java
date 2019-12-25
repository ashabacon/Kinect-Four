package com.ashabacon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KinectFour extends JPanel {
//    private JButton button = new JButton("My Button");
//    private char empty = 'O', full = 'X';
    private final int rows = 6, columns = 7;
    private JButton grid[][] = new RoundButton[rows][columns];
    KinectFour () {
        setLayout(new FlowLayout());
        setBackground(Color.gray);

        JPanel playSpace = new JPanel();
        playSpace.setBackground(Color.lightGray);
        playSpace.setLayout(new GridLayout(rows, columns, 3, 3));
        playSpace.setSize(400, 400);

        for (int i = 0; i < rows*columns; i++) {
            int x = i % rows;
            int y = i % columns;
            grid[x][y] = new RoundButton();
            playSpace.add(grid[x][y]);

//            grid[x][y].setContentAreaFilled(false);
            grid[x][y].addActionListener(new ButtonListener());
            grid[x][y].setFont(new Font("Times", Font.PLAIN, 30));
            grid[x][y].setPreferredSize(new Dimension(50, 50));
            // grid = array
            // grid[x] = array
            // grid[x][y] = Jbutton - different methods available
        }

        add(playSpace, BorderLayout.SOUTH);


    }
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
//            if (e.getSource() == grid) {
//                System.out.println("Button Clicked");
//            }
        }
    }
}
