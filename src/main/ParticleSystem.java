package main;

import java.awt.Graphics;
import java.util.ArrayList;

public class ParticleSystem {

    private ArrayList<Particle> particles = new ArrayList<>();

    public void addParticle(Particle p) {
        particles.add(p);
    }

    public void update() {
    }

    public void render(Graphics g) {
    }
}
