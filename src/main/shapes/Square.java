package main.shapes;

import java.awt.Graphics;

public class Square extends Shape {

    @Override
    public void draw(Graphics g, int size) {
        g.drawRect(0, 0, size, size);
    }
}
