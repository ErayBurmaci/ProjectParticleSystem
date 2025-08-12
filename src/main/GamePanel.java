package main;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import main.vector.Vector;

public class GamePanel extends JPanel {

    private ParticleSystem particleSystem;
    private Timer timer;

    public GamePanel(ParticleSettings settings) {
        setPreferredSize(new Dimension(settings.getWidth(), settings.getHeight()));
        setBackground(settings.getBackgroundColor());

        particleSystem = new ParticleSystem();

        for (int i = 0; i < settings.getParticleCount(); i++) {
            Shape shape;
            switch (settings.getShapeType().toLowerCase()) {
                case "circle":
                    shape = new Circle();
                    break;
                case "square":
                    shape = new Square();
                    break;
                case "random":
                default:
                    if (Math.random() < settings.getCircleProbability()) {
                        shape = new Circle();
                    } else {
                        shape = new Square();
                    }
                    break;
            }
            List<Color> colors = settings.getParticleColors();
            Color particleColor = colors.get((int) (Math.random() * colors.size()));

            particleSystem.addParticle(
                    new Particle(
                            new Vector(settings.getStartX(), settings.getStartY()),
                            new Vector(
                                    Math.random() * (settings.getVelocityMax() - settings.getVelocityMin()) +
                                    settings.getVelocityMin(),
                                    Math.random() * (settings.getVelocityMax() - settings.getVelocityMin()) +
                                    settings.getVelocityMin()
                            ),
                            new Vector(settings.getAccelerationX(), settings.getAccelerationY()),
                            settings.getLifespan(),
                            shape,
                            settings.getParticleSize(),
                            particleColor,
                            settings.getWeight()
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
