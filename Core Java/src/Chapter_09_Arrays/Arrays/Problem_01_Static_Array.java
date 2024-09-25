package Chapter_09_Arrays.Arrays;

public class Problem_01_Static_Array {
    public static void main(String[] args) {
        int A [] = {3,9,7,8,12,6,15,5,4,10};
        // Accessing array element
        System.out.println(A[0]);
        System.out.println(A[1]);
        System.out.println(A[2]);
        System.out.println(A[3]);
        System.out.println(10<10);
        // Accessing array with for loops
        System.out.println(A.length);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+",");
        }
        System.out.println("");
    }
}
