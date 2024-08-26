package Chapter_09_Arrays.Arrays;

import java.util.Scanner;

public class Problem_04_Length_Of_Array {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in array ");
        for (int i=0; i<5;i++){
           a[i] = sc.nextInt();
        }
        System.out.println("Printing Array Element");
        for (int j : a) {
            System.out.print(j + ",");
        }
        System.out.println("\nArray Length " + a.length);
    }
}
