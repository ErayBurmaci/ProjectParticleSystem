package main;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.vector.Vector;

public class GamePanel extends JPanel {

    private ParticleSystem particleSystem;
    private Timer timer;

    public GamePanel() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);

        particleSystem = new ParticleSystem();

        for (int i = 0; i < 50; i++) {
            Shape shape;
            if (Math.random() < 0.5) {
                shape = new Circle();
            } else {
                shape = new Square();
            }

            particleSystem.addParticle(
                    new Particle(
                            new Vector(400, 300),
                            new Vector(Math.random() * 4 - 2, Math.random() * 4 - 2),
                            new Vector(0, 0),
                            255,
                            shape
                    )
            );
        }
    }

    public void start() {
        timer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                particleSystem.update();
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        particleSystem.render(g);
    }
}
