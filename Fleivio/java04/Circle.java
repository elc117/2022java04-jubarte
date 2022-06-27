package java04;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double r){
        super("Circulo", 2);
        radius = r;
    }

    public Double getArea(){
        return 2 * Math.PI * Math.pow(radius,2);
    }

}
