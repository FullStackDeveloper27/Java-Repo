package Chapter_09_Arrays.Arrays;

public class Problem_19_Find_Max_Element_In_Array {
    public static void main(String[] args) {
        // Find the Maximum element in the array
        int A [] = {3,9,7,8,12,6,15,5,4,10};
        int max = A[0];
        for (int i=0;i<A.length;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        System.out.println(max);
    }

}
