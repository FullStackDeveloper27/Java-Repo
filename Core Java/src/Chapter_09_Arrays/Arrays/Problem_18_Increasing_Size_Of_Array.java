package Chapter_09_Arrays.Arrays;

public class Problem_18_Increasing_Size_Of_Array {
    public static void main(String[] args) {
        int A [] = {3,9,7,8,12};
        int B[] = new int[2*A.length];
        for(int i=0;i<A.length;i++){
            B[i]= A[i];
        }
        A=B;
        System.out.println(A.length);
        System.out.println(B.length);
        for(int i=0;i<B.length;i++){
            System.out.print(B[i]+",");
        }
        System.out.println("");
    }
}
