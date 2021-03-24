package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.shapes.*;
import uaslp.ingenieria.labs.shapes.triangles.TriangleEquilatero;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList<Shape> shapes = new LinkedList<>();

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(8, 3));
        shapes.add(new Rectangle(14, 10));
        shapes.add(new Square(10));
        shapes.add(new TriangleEquilatero(6));

        for (Shape shape : shapes) {
            System.out.println("Name: " + shape.getName());
            System.out.println("Sides count: " + shape.getSidesCount());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Area: " + shape.getArea());
            System.out.println("-----------------------------------------------");


        }

        List<DrawableItem> drawableItems = new LinkedList<>();

        drawableItems.addAll(shapes);

        drawableItems.add(new School());
        drawableItems.add(new House());
        drawableItems.add(new Dog());

        drawItems(drawableItems);

    }

    public static void drawItems(List<DrawableItem> drawableItems){

        System.out.println("Drawing Items: ");

        for(DrawableItem drawableItem: drawableItems){
            drawableItem.draw();
        }
    };
}
