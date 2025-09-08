package main.gui;

import javax.swing.JFrame;

import main.core.GamePanel;
import main.presets.Confetti;
import main.presets.ParticleSettings;

public class Main {

    public static void main(String[] args) {
        ParticleSettings settings = new Confetti();
        GamePanel panel = new GamePanel(settings);


        JFrame frame = new JFrame("Particle System");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(settings.getWidth(), settings.getHeight());
        frame.add(panel);
        frame.setVisible(true);

        panel.start();
    }
}