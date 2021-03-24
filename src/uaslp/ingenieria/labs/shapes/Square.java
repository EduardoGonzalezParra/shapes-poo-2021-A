package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Square extends Shape {

    private int side;

    public Square(int side) {
        super(new int[]{side, side, side, side});
        this.side = side;
    }

    @Override
    public String getName() {
        return "Square";
    }

    //public double getPerimeter() {
    //    return side * 4;
    //}

    //public int getSidesCount() {
    //    return 4;
    //}

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("SQUARE");
    }

}
