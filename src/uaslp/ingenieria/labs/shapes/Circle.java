package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Circle extends Shape {
    private int radio;

    public Circle(int radio) {
        super(null);
        this.radio = radio;
    }

    // Re-definir el método en una clase hija: SOBRE-ESCRITURA -> OVERWRITING

    // Sobrecarga = Overloading // polimorfismo

    // Polimorfismo: Enviar un mensaje a un objeto y que este responda de diferentes maneras
    @Override
    public String getName() {
        return "Circle";
    }

    public int getRadio() {
        return radio;
    }

    public int getSidesCount() {
        return 0;
    }

    public double getPerimeter() {
        return Math.PI * 2 * radio ;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }
}
