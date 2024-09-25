package Chapter_13_Method_Overriding;

class Super{
    public void display(){
        System.out.println("Hello Super class");
    }
}
class SubClass extends Super{
    public void display(){
        System.out.println("Hello World SubClass");
    }
}
public class Method_Overriding_01 {
    public static void main(String[] args) {
        // creating an object for super class
        Super su = new Super();
        su.display(); // This will super class method

        // creating an object for subclass
        SubClass sb = new SubClass();
        sb.display(); // this will call subclass method and super class will be shadow for subclass
    }
}
