package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class IsoscelesTriangle extends Triangle {
    private int side1;
    private int side2;
    private int side3;

    public IsoscelesTriangle(int side1, int side2, int side3){
        super(new int[]{side1, side2, side3}, side1, side2);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String getName() {
        return "Triangle Equilatero";
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public int getSidesCount() {
        return 3;
    }

    @Override
    public void draw() {
        System.out.println("TRIANGLE ISOSCELES");
    }
}
