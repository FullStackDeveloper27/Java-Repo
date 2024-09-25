package Chapter_11_OOPS.Chapter_03_Inheritance;
class Parent
{
    public Parent()
    {
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructor");
    }
}
class Grandchild extends Child
{
    public Grandchild()
    {
        System.out.println("Grand Child Constructor");
    }
}
public class Constructor_In_Inheritance {
    public static void main(String[] args) {
        Grandchild gc = new Grandchild();
    }
}
