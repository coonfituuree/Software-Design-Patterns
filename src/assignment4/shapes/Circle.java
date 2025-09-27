package assignment4.shapes;

import assignment4.color.interfaces.IColor;

public class Circle extends Shape {
    public Circle(IColor color) {
        super(color);
    }
    @Override
    public void draw() {
        System.out.println("Drawing Circle in " + color.fill() + " color");
    }
}
