package Chapter_15_Static_Final;
//final class TestF{ // you cannot inheritance final class
class TestF{
    public final void show(){
        System.out.println("Hello");
    }
}
class TestS extends TestF{
//    public void show(){} // cannot overide final method
}
public class Final {
    public static void main(String[] args) {
        // creating final variable
        final int a = 10;
        // creating final variable without value assign
        final int b;
        b=20;
        System.out.println(a);
        System.out.println(b);

    }
}
