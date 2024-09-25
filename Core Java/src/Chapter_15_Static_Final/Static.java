package Chapter_15_Static_Final;
class Test{
//    static variables
    static int price = 10;
    int a =20;

    // creating non-static method
    void show(){
        System.out.println(price); // In non-static method can access static members data
        System.out.println(price+" "+a); // In non-static method can access static members data and non-static data members
    }
    // static methods can access only static members' data.
    static void display(){
        System.out.println(price);
        //System.out.println(price + " "+a); // here I am trying to access non-static data inside static method that's not allowed
    }

}
public class Static {
    public static void main(String[] args) {
        // creating an object for the class
        Test t1 = new Test();
        t1.show();
        // creating another object for same class
        Test t2 = new Test();
        t2.show();

        // Now I am changing the value for static data and non-static data
        t1.a=30;
        t1.show();



    }
}
