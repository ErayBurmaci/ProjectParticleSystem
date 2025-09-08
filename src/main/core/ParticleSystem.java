package main.core;

import java.awt.Graphics;
import java.util.ArrayList;

public class ParticleSystem {

    private ArrayList<Particle> particles = new ArrayList<>();

    public void addParticle(Particle p) {
        particles.add(p);
    }

    public void removeParticle(Particle p) {
        particles.remove(p);
    }

    public void update() {
        for (Particle p : particles) {
            p.update();
        }
        particles.removeIf(Particle::isDead);
    }


    public void render(Graphics g) {
        for (Particle p : particles) {
            p.render(g);
        }
    }
}
