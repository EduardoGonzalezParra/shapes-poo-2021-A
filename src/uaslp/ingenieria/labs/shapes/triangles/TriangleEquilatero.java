package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleEquilatero extends Triangle {
    private double side;

    public TriangleEquilatero(double side){
        this.side = side;
    }

    public String getName() {
        return "Triangle Equilatero";
    }

    public double getPerimeter() {
        return side * 3;
    }

    public int getSidesCount() {
        return 3;
    }

    public double getArea() {
        double height = Math.sqrt(side * side - ((side /2) * (side / 2)));
        return height * side / 2;
    }
}
