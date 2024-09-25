package Chapter_14_Inner_Class;
class staticOuter{
    static int x =10;
    int y =20;
    static class my{
        public void show(){
            System.out.println(x); // we cannot access non-static members
        }
    }

}
public class Static_Inner_Class {
    public static void main(String[] args) {
        staticOuter.my m = new staticOuter.my();
        m.show();
    }
}
