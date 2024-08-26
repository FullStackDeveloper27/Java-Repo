package Chapter_09_Arrays.Arrays;

public class Problem_17_Find_Second_Largest_Element_Array {
    public static void main(String[] args) {
        // Find Second-Largest Element in the array
        int A [] = {3,9,7,8,12,6,15,5,4,10};
        int max1,max2;
        max1=max2=A[0];
        for (int i =0;i<A.length;i++){
            if(A[i]>max1){
                max2 = max1;
                max1 = A[i];
            }else if(A[i]>max2) {
                max2=A[i];
            }
        }
        System.out.println("Second Largest number is " + max2);

    }
}
