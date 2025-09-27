package assignment4.shapes;

import assignment4.color.interfaces.IColor;

public abstract class Shape {
    protected IColor color;
    public Shape(IColor color) {
        this.color = color;
    }

    public abstract void draw();
}
