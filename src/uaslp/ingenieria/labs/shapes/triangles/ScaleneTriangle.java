package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class ScaleneTriangle extends Triangle {
    private int side;
    private int base;

    public ScaleneTriangle(int side, int base){
        super(new int[]{side, side, base}, side, base);
        this.side = side;
        this.base = base;
    }

    @Override
    public String getName() {
        return "Triangle Equilatero";
    }

    public double getPerimeter() {
        return side * 2 + base;
    }

    public int getSidesCount() {
        return 3;
    }

    @Override
    public double getArea() {
        double height = Math.sqrt(side * side - ((base /2.0) * (base / 2.0)));
        return base * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("TRIANGLE ESCALENO");
    }
}
