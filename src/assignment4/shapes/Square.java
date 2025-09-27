package assignment4.shapes;

import assignment4.color.interfaces.IColor;

public class Square extends Shape {
    public Square(IColor color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square in " + color.fill() + " color");
    }
}
