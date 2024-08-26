package Chapter_10_Methods;

public class Method_02_Method_Object_Passing {
    static void change(int A[],int index,int value){
        A[index] = value;
    }
    // creating another by passing primitive parameter
    static void change2(int x,int value){
        x=value;
    }
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        change(A,2,20);
        for (int X : A){
            System.out.println(X);
        }

        // we are calling method but in primitive type values cannot be changed.
        int x=10;
        change2(x,20);
        System.out.println(x);
    }
}
