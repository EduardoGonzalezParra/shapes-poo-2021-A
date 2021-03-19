package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Triangle extends Shape {
    int base;
    double height;

    // No puedo crear un triángulo sin definir de qué tipo es

    public String getName() {
        return "Triangle";
    }

    public int getSidesCount() {
        return 3;
    }

    public double getPerimeter() {
        return 0;
    }

    public double getArea(){
        return base * height / 2;
    }

}
