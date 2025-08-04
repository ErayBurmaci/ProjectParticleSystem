package main;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

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
        particles.removeIf(p -> p.isDead());
    }


    public void render(Graphics g) {
        for (Particle p : particles) {
            p.render(g);
        }
    }
}
