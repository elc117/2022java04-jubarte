package java04.jubarte;

import java04.*;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(10, 8);
        System.out.println("quadrado: " + square.getArea());

        Circle circle = new Circle(7.0);
        System.out.println("circulo: " + circle.getArea());
    }
}