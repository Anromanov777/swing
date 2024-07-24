package otherplanets;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Planets {
    String path;
    int radius;
    double speed;
    int x;
    int y;
    private double grad;

    Random random = new Random();

    public Planets(String path, int radius, double speed) {
        this.path = path;
        this.radius = radius;
        this.speed = speed;
        grad = random.nextInt(0, 360);
    }

    public Image getImage2() {
        return new ImageIcon(path).getImage();

    }

    public int getX() {
        if (grad >= 360.0) grad = grad - 360.0;
        double rad = Math.toRadians(grad);
        x = (int) (radius * Math.cos(rad)) - getImage2().getWidth(null) / 2;
        grad += speed;
        return x;
    }

    public int getY() {
        if (grad >= 360.0) grad = grad - 360.0;
        double rad = Math.toRadians(grad);
        y = (int) (radius * Math.sin(rad)) - getImage2().getHeight(null) / 2;
        grad += speed;
        return y;
    }
}
