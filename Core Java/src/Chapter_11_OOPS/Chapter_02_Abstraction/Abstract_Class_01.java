package Chapter_11_OOPS.Chapter_02_Abstraction;
abstract class Super{

    // constructor for super class
    public Super(){
        System.out.println("Super Class Constructor");
    }
    // creating method in super class
    public void meth1(){
        System.out.println("Super class method 1");
    }
    // creating abstract method when you create abstract method then you need to make your class as abstract.
    abstract public void meth2();
}
// creating another class or we can call concrete class
class Sub extends Super{
    // when you inherit the super class in subclass you need to override the abstract class from super class if not declare as abstract keyword in subclass.
    public void meth2(){
        System.out.println("Sub Class Method");
    }
}
public class Abstract_Class_01 {
    public static void main(String[] args) {
        // when your class is abstract you can't create object for that class. you can create a reference to abstract class
        // Super su = new Super();
        // su.meth1();

        // we can create a object for concrete class
        Sub s = new Sub();
        s.meth1();
        s.meth2();
    }
}
