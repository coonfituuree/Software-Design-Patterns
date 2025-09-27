package assignment4;

import assignment4.color.Blue;
import assignment4.color.Red;
import assignment4.shapes.Circle;
import assignment4.shapes.Shape;
import assignment4.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        Shape blueSquare = new Square(new Blue());

        redCircle.draw();
        blueSquare.draw();
    }
}
