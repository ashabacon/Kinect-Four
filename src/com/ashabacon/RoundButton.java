package com.ashabacon;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class RoundButton extends JButton {
    Shape shape;
    public RoundButton () {
//        super(label);
        setOpaque(true);
        Dimension size = getPreferredSize();
        size.width = size.height = Math.max(size.width, size.height);
        setPreferredSize(size);
        setContentAreaFilled(false);
        setBounds(0,0, size.width, size.height);

    }
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.blue);
        } else {
            g.setColor(getBackground());
//            g.setColor(Color.red);
        }
        g.fillOval(0, 0, getSize().width-1,getSize().height-1);

//        super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
//        g.setColor(Color.red);
        g.drawOval(0, 0, getSize().width-1,getSize().height-1);
    }

    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new Ellipse2D.Float(0, 0, getPreferredSize().width, getPreferredSize().height);
        }
        return shape.contains(x, y);
    }
//    Graphics2D g;
//    Shape circle = new Ellipse2D.Float(0, 0, getPreferredSize().width, getPreferredSize().height);
}
