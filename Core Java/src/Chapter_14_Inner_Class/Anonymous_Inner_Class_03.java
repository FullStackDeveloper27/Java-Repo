package Chapter_14_Inner_Class;
abstract class my{
    abstract public void show();
}
class outerA{
    public void Display(){
        my m = new my() {
            @Override
            public void show() {
                System.out.println("hello");
            }
        };
        m.show();
    }
}
public class Anonymous_Inner_Class_03 {
    public static void main(String[] args) {
        outerA o = new outerA();
        o.Display();
    }
}
