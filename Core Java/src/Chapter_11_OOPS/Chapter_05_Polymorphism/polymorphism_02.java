package Chapter_11_OOPS.Chapter_05_Polymorphism;
class Shape{
    void draw(){System.out.println("drawing...");}
}
class Rectangle extends Shape{
    void draw(){System.out.println("drawing rectangle...");}
}
class Circle extends Shape{
    void draw(){System.out.println("drawing circle...");}
}
class Triangle extends Shape{
    void draw(){System.out.println("drawing triangle...");}
}
public class polymorphism_02 {
    public static void main(String[] args) {
        Shape s;
        s=new Rectangle();
        s.draw();
        s=new Circle();
        s.draw();
        s=new Triangle();
        s.draw();
    }
}
