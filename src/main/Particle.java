package main;

import main.vector.Vector;

import java.awt.Graphics;

public class Particle {

    private Vector position;
    private Vector velocity;
    private Vector acceleration;
    private double lifespan;
    private Shape shape;

    public Particle(Vector position, Vector velocity, Vector acceleration, double lifespan, Shape shape) {
        this.position = position;
        this.velocity = velocity;
        this.acceleration = acceleration;
        this.lifespan = lifespan;
        this.shape = shape;
    }

    public void update() {
    }

    public void render(Graphics g) {
        shape.draw(g);
    }

    public boolean isDead() {
        return lifespan <= 0;
    }
}

