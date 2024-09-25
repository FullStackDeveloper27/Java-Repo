package Chapter_13_Method_Overriding;

// Dynamic Method Dispatch
class Super1
{
    public void meth1() {
        System.out.println("meth1");
    }
    public void meth2() {
        System.out.println("super meth2");
    }
}
class Sub1 extends Super
{
    public void meth2() {
        System.out.println("sub meth2");
    }
    public void meth3() {
        System.out.println("meth3");
    }
}
public class Method_Overriding_02 {
    public static void main(String[] args) {
        // creating an object for subclass
//        Super1 su = new Sub1();
//        su.display(); // this will call subclass method and super class will be shadow for subclass
    }
}
