package main;

import java.awt.Graphics;

public class Square extends Shape {

    @Override
    public void draw(Graphics g) {
        g.drawRect(0, 0, 10, 10);
    }
}
