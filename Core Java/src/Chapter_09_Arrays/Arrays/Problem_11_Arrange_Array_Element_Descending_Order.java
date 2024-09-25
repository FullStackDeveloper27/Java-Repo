package Chapter_09_Arrays.Arrays;

public class Problem_11_Arrange_Array_Element_Descending_Order {
    public static void main(String[] args) {
        int[] A = {3,9,7,8,12,6,15,5,4,10};
        int temp;
        for (int i=0;i<A.length;i++){
            for (int j=i+1;j<A.length;j++){
                if(A[i]<A[j]){
                    temp = A[i];
                    A[i] = A[j];
                    A[j]=temp;
                }
            }
        }
        for(int J : A){
            System.out.print(J+",");
        }
    }
}
