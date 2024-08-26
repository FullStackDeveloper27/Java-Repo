package Chapter_10_Methods;

public class Method_03_Paramter_Passing {
   static int add(int x,int y){ // x and y is formal parameter
       int z;
       z = x+y;
       return z;
   }

    public static void main(String[] args) {
       int a=10,b=20,c;
       // calling method
       // a,b is actual method
        c = add(a,b);
        System.out.println(c);
    }
}
