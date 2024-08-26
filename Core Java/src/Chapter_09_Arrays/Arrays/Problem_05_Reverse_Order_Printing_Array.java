package Chapter_09_Arrays.Arrays;

import java.util.Scanner;

public class Problem_05_Reverse_Order_Printing_Array {
    public static void main(String[] args) {
        int Size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array ");
        // we can decide the size of array at runtime
        Size = sc.nextInt();
        int A[] = new int[Size];
        for (int i=0;i<Size;i++){
            A[i]= sc.nextInt(); // A[i] we are storing array element
        }
        System.out.println("Printing array element ");
        for(int i=0;i<Size;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("\nReversing array element");
        for (int i=Size-1; i>=0;i--){
            System.out.print(A[i]+" ");
        }

    }
}
