package Chapter_15_Static_Final;
class mine{
    static int a;
    static {
        System.out.println("block 1");
        a=10;
    }
    static {
        System.out.println("Block 2");
    }
}
public class static_block {
    public static void main(String[] args) {
        mine m = new mine();
        System.out.println("main");
    }
}
