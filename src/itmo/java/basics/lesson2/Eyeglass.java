package itmo.java.basics.lesson2;

import java.awt.*;

public class Eyeglass {
    private String ownersName;
    private Color color;
    private FrameMaterial frameMaterial;
    private double leftDiopters;
    private double rightDiopters;

    /**Default Eyeglass-constructor*/
    public Eyeglass(String ownersName, Color color) {
        this.ownersName = ownersName;
        this.color = color;
    }

    public Eyeglass(String ownersName, Color color, FrameMaterial frameMaterial) {
        this(ownersName, color);
        this.frameMaterial = frameMaterial;
    }

    public Eyeglass(String ownersName, Color color, FrameMaterial frameMaterial, double leftDiopters, double rightDiopters) {
        this(ownersName, color, frameMaterial);
        this.leftDiopters = leftDiopters;
        this.rightDiopters = rightDiopters;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public FrameMaterial getFrameMaterial() {
        return frameMaterial;
    }

    public void setFrameMaterial(FrameMaterial frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public double getLeftDiopters() {
        return leftDiopters;
    }

    public void setLeftDiopters(double leftDiopters) {
        this.leftDiopters = leftDiopters;
    }

    public double getRightDiopters() {
        return rightDiopters;
    }

    public void setRightDiopters(double rightDiopters) {
        this.rightDiopters = rightDiopters;
    }
}
