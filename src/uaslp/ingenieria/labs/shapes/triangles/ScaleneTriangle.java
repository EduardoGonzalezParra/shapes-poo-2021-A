package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class ScaleneTriangle extends Triangle {
    private double sides;
    private double base;

    public ScaleneTriangle(double sides, double base){
        this.sides = sides;
        this.base = base;
    }

    public String getName() {
        return "Triangle Equilatero";
    }

    public double getPerimeter() {
        return sides * 2 + base;
    }

    public int getSidesCount() {
        return 3;
    }

    public double getArea() {
        double height = Math.sqrt(sides * sides - ((base /2) * (base / 2)));
        return base * height / 2;
    }
}
