package main;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class Snowfall implements ParticleSettings {

    @Override
    public double getStartX() {
        return 500;
    }

    @Override
    public double getStartY() {
        return 0;
    }

    @Override
    public int getParticleCount() {
        return 200;
    }

    @Override
    public double getVelocityMin() {
        return -0.5;
    }

    @Override
    public double getVelocityMax() {
        return 0.5;
    }

    @Override
    public double getAccelerationX() {
        return 0;
    }

    @Override
    public double getAccelerationY() {
        return 0.02; // Langsam fallen
    }

    @Override
    public double getLifespan() {
        return 500;
    }

    @Override
    public String getShapeType() {
        return "circle";
    }

    @Override
    public Color getBackgroundColor() {
        return Color.BLACK;
    }

    @Override
    public int getParticleSize() {
        return 6;
    }

    @Override
    public double getCircleProbability() {
        return 1.0;
    }

    @Override
    public int getHeight() {
        return 800;
    }

    @Override
    public int getWidth() {
        return 1000;
    }

    @Override
    public List<Color> getParticleColors() {
        return Arrays.asList(
                new Color(203, 226, 245),
                new Color(178, 211, 240),
                new Color(101, 203, 235)
        );
    }

}
