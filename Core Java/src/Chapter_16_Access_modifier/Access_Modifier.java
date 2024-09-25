package Chapter_16_Access_modifier;
class Demo1{
    int a =10;
    public int b =20;
    protected int c=30;
    public int d=40;
    public void display(){
        System.out.println(a+b+c+d); // all the modifier can be accessed inside the same class
    }
}
class Demo2 extends Demo1{
    public void show()
    {
        System.out.println(a+b+c+d);
    }
}
public class Access_Modifier {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.show();
    }

}
