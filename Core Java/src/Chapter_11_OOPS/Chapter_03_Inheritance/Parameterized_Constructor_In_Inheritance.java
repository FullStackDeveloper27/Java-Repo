package Chapter_11_OOPS.Chapter_03_Inheritance;
class Parent1
{
    public Parent1()
    {
        System.out.println("Parent Constructor");
    }
    public Parent1(int x){
        System.out.println("Parameter in constructor"+x);
    }
}
class Child1 extends Parent
{
    public Child1()
    {
        System.out.println("Child Constructor");
    }
    public Child1(int y)
    {
        System.out.println("parameter in Child Constructor"+y);
    }
    public Child1(int x, int y)
    {
        super();
        System.out.println("parameter in Child Constructor x = "+x + "y = "+y);
    }
}
public class Parameterized_Constructor_In_Inheritance {
    public static void main(String[] args) {
        Child1 ch = new Child1(10);
        Child1 ch1 = new Child1(10,12);
    }
}
