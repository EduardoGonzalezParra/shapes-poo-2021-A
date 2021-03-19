package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class IsoscelesTriangle extends Triangle {
    private double side1;
    private double side2;
    private double side3;

    public IsoscelesTriangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String getName() {
        return "Triangle Equilatero";
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public int getSidesCount() {
        return 3;
    }
}
