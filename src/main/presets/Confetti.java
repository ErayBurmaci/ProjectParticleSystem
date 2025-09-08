package main.presets;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;

@Getter
public class Confetti implements ParticleSettings {

    private final double startX = 500;
    private final double startY = 0;
    private final int particleCount = 300;
    private final double velocityMin = -1.5;
    private final double velocityMax = 1.5;
    private final double accelerationX = 0;
    private final double accelerationY = 0.05;
    private final double lifespan = 300;
    private final String shapeType = "random";
    private final Color backgroundColor = Color.BLACK;
    private final int particleSize = 8;
    private final double circleProbability = 0.3;
    private final int height = 800;
    private final int width = 1000;
    private final List<Color> particleColors = Arrays.asList(
            Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.MAGENTA, Color.CYAN
    );
    private final double weight = 0.05;
}
