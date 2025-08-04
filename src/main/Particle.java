package main;

import main.vector.Vector;

import java.awt.Graphics;

public class Particle {

    private Vector position;
    private Vector velocity;
    private Vector acceleration;
    private Vector weight;
    private double lifespan;
    private Shape shape;

    public Particle(Vector position, Vector velocity, Vector acceleration, double lifespan, Shape shape) {
        this.position = position;
        this.velocity = velocity;
        this.acceleration = acceleration;
        this.lifespan = lifespan;
        this.shape = shape;
    }

    /**
     * Updates the state of the particle: - Velocity is adjusted by acceleration. - Position is updated using the new
     * velocity. - Lifespan is decreased.
     */
    public void update() {
        velocity.add(acceleration);
        position.add(velocity);
        lifespan -= 1;
    }

    /**
     * Renders the particle on the screen using the given graphics context. The particle fades over time based on its
     * remaining lifespan.
     *
     * @param g The graphics context to draw the particle on.
     */
    public void render(Graphics g) {
        g = g.create();
        g.setColor(new java.awt.Color(255, 255, 255));
        g.translate((int) position.getX(), (int) position.getY());
        shape.draw(g);
    }


    public boolean isDead() {
        return lifespan <= 0;
    }
}
