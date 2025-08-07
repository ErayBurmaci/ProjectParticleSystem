package main;

import java.awt.Color;
import java.util.List;

public interface ParticleSettings {

    double getStartX();

    double getStartY();

    int getParticleCount();

    double getVelocityMin();

    double getVelocityMax();

    double getAccelerationX();

    double getAccelerationY();

    double getLifespan();

    String getShapeType();

    Color getBackgroundColor();

    int getParticleSize();

    double getCircleProbability();

    int getHeight();

    int getWidth();

    List<Color> getParticleColors();
}

