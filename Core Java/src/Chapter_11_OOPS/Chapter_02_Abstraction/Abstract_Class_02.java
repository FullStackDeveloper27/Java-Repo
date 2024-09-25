package Chapter_11_OOPS.Chapter_02_Abstraction;
abstract class Shape{

    abstract public double Perimeter();
    abstract public double area();
}
class Circle extends Shape{
    int radius;
    public double Perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
       return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;
    public double Perimeter(){
        return 2*(length+breadth);
    }
    public double area(){
        return length*breadth;
    }
}
public class Abstract_Class_02 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth =20;
        System.out.println(r.area());
        System.out.println(r.Perimeter());
        Circle c = new Circle();
        c.radius =20;
        System.out.println(c.Perimeter());
        System.out.println(c.area());
    }
}
