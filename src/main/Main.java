package main;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        ParticleSettings settings = new Volcano();
        GamePanel panel = new GamePanel(settings);


        JFrame frame = new JFrame("Particle System");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(settings.getWidth(), settings.getHeight());
        frame.add(panel);
        frame.setVisible(true);

        panel.start();
    }
}