package java04.jubarte;

import java04.*;

public class Square extends Shape {
    protected float width, height;

    public Square(float width, float height) {
        super("Quadrado", 2);
    }

    public float getArea() {
        return width * height;
    }
}