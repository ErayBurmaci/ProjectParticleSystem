package main.shapes;

import java.awt.Graphics;


public class Circle extends Shape {

    @Override
    public void draw(Graphics g, int size) {
        g.drawOval(0, 0, size, size);
    }
}
