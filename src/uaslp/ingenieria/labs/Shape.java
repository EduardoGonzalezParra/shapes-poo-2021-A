package uaslp.ingenieria.labs;

// No tiene sentido instanciar Shape

public abstract class Shape implements DrawableItem {

    private int sides[];

    public Shape(int[] sides) {
        this.sides = sides;
    }

    public abstract String getName();

    public int getSidesCount(){
        return sides.length;
    };

    public double getPerimeter(){
        int perimeter = 0;

        for(int side: sides){
            perimeter += side;
        }
        return perimeter;
    };

    public abstract double getArea();
}
