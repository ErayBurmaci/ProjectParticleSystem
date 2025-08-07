package main;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

/**
 * A preset for a volcano eruption style particle system.
 */
public class Volcano implements ParticleSettings {

    @Override
    public double getStartX() {
        return 500;
    }

    @Override
    public double getStartY() {
        return 550;
    }

    @Override
    public int getParticleCount() {
        return 450;
    }

    @Override
    public double getVelocityMin() {
        return -4;
    }

    @Override
    public double getVelocityMax() {
        return 4;
    }

    @Override
    public double getAccelerationX() {
        return 0;
    }

    @Override
    public double getAccelerationY() {
        return 0.15;
    }

    @Override
    public double getLifespan() {
        return 200;
    }

    @Override
    public String getShapeType() {
        return "circle";
    }

    @Override
    public Color getBackgroundColor() {
        return new Color(30, 30, 30);
    }

    @Override
    public int getParticleSize() {
        return 12;
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
                Color.ORANGE,
                Color.RED,
                Color.YELLOW
        );
    }
}
