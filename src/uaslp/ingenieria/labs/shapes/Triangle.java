package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public abstract class Triangle extends Shape {
    protected int base;
    protected double height;

    public Triangle(int[] sides, int base, double height) {
        super(sides);
        this.base = base;
        this.height = height;
    }

    // No puedo crear un triángulo sin definir de qué tipo es
    @Override
    public abstract String getName();

    @Override
    public double getArea() {
        return base * height / 2.0;
    }

}
