interface Shape{
    abstract double getArea();
}

class Rectangle implements Shape{
    private double length;
    private double width;
    public Rectangle(double l, double w){
        length = l;
        width = w;
    }
    public double getArea(){
        return length*width;
    }
    public String toString(){
        return "Rectangle Area="+getArea();
    }
}

class Triangle implements Shape{
    private double base;
    private double height;
    public Triangle(double b, double h){
        base=b;
        height=h;
    }
    public double getArea(){
        return base*height*0.5;
    }
    public String toString(){
        return "Triangle Area="+getArea();
    }
}

public class homework2{
    public static void main(String args[]){
        Rectangle rectangle;
        Triangle triangle;

        rectangle = new Rectangle(10, 20);
        System.out.println(rectangle);
        triangle = new Triangle(10, 20);
        System.out.println(triangle);
    }
}