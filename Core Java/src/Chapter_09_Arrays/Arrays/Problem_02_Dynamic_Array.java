package Chapter_09_Arrays.Arrays;

import java.util.Scanner;

public class Problem_02_Dynamic_Array {
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
        // printing array element
        System.out.println("Printed Element");
        for(int X:A){
            System.out.print(X+",");
        }
        System.out.println("");
    }
}
