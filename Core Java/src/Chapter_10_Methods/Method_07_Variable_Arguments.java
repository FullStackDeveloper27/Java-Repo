package Chapter_10_Methods;

public class Method_07_Variable_Arguments {
    static void show(int ...A){
        for (int x:A){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        show(1);
        show(1,2,4);
        show(new int[]{2,3,4,56,7,8,8,2});

     }
}
