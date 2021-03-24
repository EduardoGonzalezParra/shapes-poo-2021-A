package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleEquilatero extends Triangle {
    private int side;

    public TriangleEquilatero(int side){
        super(new int[]{side, side, side}, side, Math.sqrt(side * side - (side /2.0 * side / 2.0)));
        this.side = side;
    }

    @Override
    public String getName() {
        return "Triangle Equilatero";
    }

    //public double getPerimeter() {
    //    return side * 3;
    //}
//
    //public int getSidesCount() {
    //    return 3;
    //}

    @Override
    public double getArea() {
        return height * side / 2;
    }
}
