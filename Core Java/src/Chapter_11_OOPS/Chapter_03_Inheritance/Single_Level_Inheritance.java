package Chapter_11_OOPS.Chapter_03_Inheritance;
class circle2{
    public double radius;
    public double area(){
        return  Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
class Cylinder extends circle2{
    public double height;
    public double volume(){
        return area()*height;
    }
}
public class Single_Level_Inheritance {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        // assigning the values to properties in the class
        cy.radius = 7;
        cy.height = 10;
        System.out.println("Volume "+ cy.volume());
        System.out.println("Area "+ cy.area());
    }
}
