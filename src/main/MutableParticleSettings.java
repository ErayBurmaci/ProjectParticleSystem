package main;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class MutableParticleSettings implements ParticleSettings {

    private double startX = 400;
    private double startY = 300;
    private int particleCount = 50;
    private double velocityMin = -2;
    private double velocityMax = 2;
    private double accelerationX = 0;
    private double accelerationY = 0;
    private double lifespan = 255;
    private int width = 1000;
    private int height = 800;
    private String shapeType = "random"; // "circle", "square", "random"
    private Color backgroundColor = Color.BLACK;
    private int particleSize = 10;
    private double circleProbability = 0.5;
    private Color[] particleColors = { Color.WHITE, Color.PINK };

    @Override
    public double getStartX() {
        return startX;
    }

    @Override
    public double getStartY() {
        return startY;
    }

    @Override
    public int getParticleCount() {
        return particleCount;
    }

    public void setStartX(double startX) {
        this.startX = startX;
    }

    public void setStartY(double startY) {
        this.startY = startY;
    }

    public void setParticleCount(int particleCount) {
        if (particleCount < 0) {
            throw new IllegalArgumentException("Particle count cannot be negative");
        }
        this.particleCount = particleCount;
    }

    @Override
    public double getVelocityMin() {
        return velocityMin;
    }

    public void setVelocityMin(double velocityMin) {
        this.velocityMin = velocityMin;
    }

    @Override
    public double getVelocityMax() {
        return velocityMax;
    }

    public void setVelocityMax(double velocityMax) {
        this.velocityMax = velocityMax;
    }

    @Override
    public double getAccelerationX() {
        return accelerationX;
    }

    public void setAccelerationX(double accelerationX) {
        this.accelerationX = accelerationX;
    }

    @Override
    public double getAccelerationY() {
        return accelerationY;
    }

    public void setAccelerationY(double accelerationY) {
        this.accelerationY = accelerationY;
    }

    @Override
    public double getLifespan() {
        return lifespan;
    }

    public void setLifespan(double lifespan) {
        if (lifespan < 0) {
            throw new IllegalArgumentException("Lifespan cannot be negative");
        }
        this.lifespan = lifespan;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    @Override
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color c) {
        this.backgroundColor = c;
    }

    @Override
    public int getParticleSize() {
        return particleSize;
    }

    public void setParticleSize(int particleSize) {
        if (particleSize < 0) {
            throw new IllegalArgumentException("Particle size cannot be negative");
        }
        this.particleSize = particleSize;
    }

    @Override
    public double getCircleProbability() {
        return circleProbability;
    }

    public void setCircleProbability(double circleProbability) {
        this.circleProbability = circleProbability;
    }

    @Override
    public List<Color> getParticleColors() {
        return Arrays.asList(particleColors);
    }

    public void setParticleColors(Color... colors) {
        if (colors == null || colors.length == 0) {
            throw new IllegalArgumentException("At least one color is required");
        }
        this.particleColors = Arrays.copyOf(colors, colors.length);
    }
}
