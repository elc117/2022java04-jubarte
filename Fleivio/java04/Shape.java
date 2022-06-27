package java04;

public class Shape{
    protected String name;
    protected int dimension;

    public Shape(String n, int d){
        name = n;
        dimension = d;
    }

    public String getName(){
        return name;
    }

    public int getDimension(){
        return dimension;
    }

    public void setName(String n){
        name = n;
    }

    public void setDimension(int d){
        dimension = d;
    }
}

