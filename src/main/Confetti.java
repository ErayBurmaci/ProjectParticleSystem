package main;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class Confetti implements ParticleSettings {

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
        return 300;
    }

    @Override
    public double getVelocityMin() {
        return -1;
    }

    @Override
    public double getVelocityMax() {
        return 1;
    }

    @Override
    public double getAccelerationX() {
        return 0;
    }

    @Override
    public double getAccelerationY() {
        return 0.05;
    }

    @Override
    public double getLifespan() {
        return 300;
    }

    @Override
    public String getShapeType() {
        return "random";
    }

    @Override
    public Color getBackgroundColor() {
        return Color.DARK_GRAY;
    }

    @Override
    public int getParticleSize() {
        return 8;
    }

    @Override
    public double getCircleProbability() {
        return 0.3;
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
                Color.RED,
                Color.BLUE,
                Color.GREEN,
                Color.YELLOW,
                Color.MAGENTA,
                Color.CYAN
        );
    }

}
