package main;

import lombok.Getter;
import main.vector.Vector;

import java.awt.Color;
import java.awt.Graphics;


public class Particle {

    private Vector position;
    private Vector velocity;
    private Vector acceleration;
    private Vector weight;
    private double lifespan;
    private Shape shape;
    private int size;
    private Color color;

    public Particle(Vector position, Vector velocity, Vector acceleration, double lifespan, Shape shape, int size,
            Color color) {
        this.position = position;
        this.velocity = velocity;
        this.acceleration = acceleration;
        this.lifespan = lifespan;
        this.shape = shape;
        this.size = size;
        this.color = color;
    }
    
    public void update() {
        velocity.add(acceleration);
        position.add(velocity);
        lifespan -= 1;
    }

    public void render(Graphics g) {
        g = g.create();
        g.setColor(color);
        g.translate((int) position.getX(), (int) position.getY());
        shape.draw(g, size);
    }


    public boolean isDead() {
        return lifespan <= 0;
    }
}
