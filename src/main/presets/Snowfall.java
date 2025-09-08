package main.presets;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import lombok.Getter;

@Getter
public class Snowfall implements ParticleSettings {

    private final Random random = new Random();
    private final double startY = 0;
    private final int particleCount = 800;
    private final double velocityMin = -0.5;
    private final double velocityMax = 0.5;
    private final double accelerationX = 0;
    private final double accelerationY = 0.02;
    private final double lifespan = 500;
    private final String shapeType = "circle";
    private final Color backgroundColor = Color.BLACK;
    private final int particleSize = 6;
    private final double circleProbability = 1.0;
    private final int height = 800;
    private final int width = 1000;
    private final List<Color> particleColors = Arrays.asList(
            new Color(203, 226, 245),
            new Color(178, 211, 240),
            new Color(101, 203, 235)
    );
    private final double weight = 0.01;

    @Override
    public double getStartX() {
        return random.nextDouble() * getWidth();
    }
}
