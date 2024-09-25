package Chapter_11_OOPS.Chapter_02_Abstraction;

interface interface1{
    default void show(){
        System.out.println("interface 1");
    }
}
interface interface2{
    default void show(){
        System.out.println("interface 2");
    }
}
class inheritance implements interface1,interface2{

    // overriding default method
    @Override
    public void show() {
        // using super keyword to call the show() method of interface 1
        interface1.super.show();
        // using super keyword to call the show() method of interface 2
        interface2.super.show();
    }
}
public class Interface_multipleInheritance {
    public static void main(String[] args) {
        inheritance in = new inheritance();
        in.show();
    }
}
