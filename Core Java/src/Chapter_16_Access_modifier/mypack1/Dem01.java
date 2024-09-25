package Chapter_16_Access_modifier.mypack1;
// same package non sub class
public class Dem01 {
    int a =10; // default we cannot access outside the package
    public int b =20; // public can access outside class and package
    protected int c=30;
    private int d=40;
    public void display(){
        System.out.println(a+b+c+d); // all the modifier can be accessed inside the same class
    }
}

