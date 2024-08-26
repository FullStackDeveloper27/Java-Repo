package Chapter_09_Arrays.Arrays;

import java.util.Scanner;

public class Problem_07_Sum_Of_Array_Elements {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array ");
        size = sc.nextInt();
        int A[] = new int[size];
        for (int i=0;i<size;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Printing the array element");
        for(int J : A){
            System.out.print(J+" ");
        }
        System.out.println("\nSum of Array Element");
        int sum=0;
        // Sum of all the element
        for (int J : A){
            sum = sum+J;
        }
        System.out.print(sum+" ");
    }
}
