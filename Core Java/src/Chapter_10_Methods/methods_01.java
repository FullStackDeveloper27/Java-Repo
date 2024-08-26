package Chapter_10_Methods;

public class methods_01 {
    // creating method
    int max(int x,int y){
        if(x>y){
            return x;
        }else {
            return y;
        }
    }
    public static void main(String[] args) {
        // creating a variables
        int a = 10, b=20;
        // System.out.println(max(a,b)); // will throw an error
        // Non-Static cannot be referred in static method.
        // to access in static method we have make method as static.

        // Another approach
        // By Creating a class object we can access method inside the static method
        methods_01 mp = new methods_01();
        System.out.println(mp.max(a,b));
    }
}
