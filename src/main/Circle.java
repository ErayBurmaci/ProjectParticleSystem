package main;

import java.awt.Graphics;

public class Circle extends Shape {

    @Override
    public void draw(Graphics g) {
        g.drawOval(0, 0, 10, 10);
    }
}
