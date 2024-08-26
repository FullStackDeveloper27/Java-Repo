package Chapter_10_Methods;

public class Method_04_Method_Overloading {
    static int add(int x,int y){
        if(x>y){
            return x;
        }else {
            return y;
        }
    }
    static float add(float x, float y){
        if(x>y){
            return x;
        }else {
            return y;
        }
    }
    static int add(int x,int y,int z){
        if(x>y && x>z){
            return x;
        }else if(y>z) {
            return y;
        }else {
            return z;
        }
    }

    public static void main(String[] args) {
        // to access method in main method we need to create static before the methods.
        System.out.println(add(2,4));
        System.out.println(add(2.5f,3.2f));
        System.out.println(add(2,3,4));
    }
}
