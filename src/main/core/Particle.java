package main.core;

import main.shapes.Shape;
import main.vector.Vector;

import java.awt.Color;
import java.awt.Graphics;


public class Particle {

    private Vector position;
    private Vector velocity;
    private Vector acceleration;
    private double weight;
    private double lifespan;
    private Shape shape;
    private int size;
    private Color color;
    private static final double gravityX = 0.0;
    private static final double gravityY = 0.0;

    public Particle(Vector position, Vector velocity, Vector acceleration, double lifespan, Shape shape, int size,
            Color color, double weight) {
        this.position = position;
        this.velocity = velocity;
        this.acceleration = acceleration;
        this.lifespan = lifespan;
        this.shape = shape;
        this.size = size;
        this.color = color;
        this.weight = weight;
    }

    public void update() {
        acceleration.add(new Vector(gravityX, weight));
        velocity.add(acceleration);
        position.add(velocity);
        lifespan -= 1;
        acceleration = new Vector(gravityX, gravityY);
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
