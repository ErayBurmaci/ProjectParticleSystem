package main;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
public class MutableParticleSettings implements ParticleSettings {

    private final double startX = 400;
    private final double startY = 300;
    private final int particleCount = 50;
    private final double velocityMin = -2;
    private final double velocityMax = 2;
    private final double accelerationX = 0;
    private final double accelerationY = 0;
    private final double lifespan = 255;
    private final int width = 1000;
    private final int height = 800;
    private final String shapeType = "random"; // "circle", "square", "random"
    private final Color backgroundColor = Color.BLACK;
    private final int particleSize = 10;
    private final double circleProbability = 0.5;
    private final List<Color> particleColors = Arrays.asList(Color.WHITE, Color.PINK);
    private final double weight = 0.0;

}
