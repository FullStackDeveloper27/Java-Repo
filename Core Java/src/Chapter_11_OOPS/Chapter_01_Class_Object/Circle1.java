package Chapter_11_OOPS.Chapter_01_Class_Object;
// How to Create a Class
class Circle{
    public double radius; // data members (also Instance variable)
    public double area(){
        return  Math.PI * radius * radius;
    } // method
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
public class Circle1 {
    public static void main(String[] args) {
        Circle cr = new Circle();// creating an object for circle
        Circle cr1 = new Circle();
        Circle cr2 = new Circle();
        cr.radius = 7;
        cr1.radius = 9;
        cr2.radius = 10 ;
        System.out.println(cr.area());
        System.out.println(cr.perimeter());
        System.out.println(cr.circumference());

        System.out.println(cr1.area());
        System.out.println(cr1.perimeter());
        System.out.println(cr1.circumference());

        System.out.println(cr2.area());
        System.out.println(cr2.perimeter());
        System.out.println(cr2.circumference());
    }

}
