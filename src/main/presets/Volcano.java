package main.presets;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import lombok.Getter;

@Getter
public class Volcano implements ParticleSettings {

    Random random = new Random();

    private final double startX = 500;
    private final double startY = 550;
    private final int particleCount = 450;
    private final double velocityMin = -4;
    private final double velocityMax = 4;
    private final double accelerationX = (Math.random() - 0.5) * 0.1;
    private final double accelerationY = -0.1 + (Math.random() - 0.5) * 0.05;
    private final double lifespan = 200;
    private final String shapeType = "circle";
    private final Color backgroundColor = new Color(30, 30, 30);
    private final int particleSize = 12;
    private final double circleProbability = 1.0;
    private final int height = 800;
    private final int width = 1000;
    private final List<Color> particleColors = Arrays.asList(
            Color.ORANGE, Color.RED, Color.YELLOW
    );
    private final double weight = 0.05;
}
