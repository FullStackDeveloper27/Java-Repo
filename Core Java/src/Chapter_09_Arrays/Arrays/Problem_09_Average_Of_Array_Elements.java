package Chapter_09_Arrays.Arrays;

import java.util.Scanner;

public class Problem_09_Average_Of_Array_Elements {
    public static void main(String[] args) {
        // a[5] = {10,20,30,40,50} --> 150
        // avg = 150/5;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size ");
        size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Printing element");
        for (int J : a){
            System.out.println(J);
        }
        System.out.println("Printing Average of array element");
        int sum=0;
        for (int i=0;i<size;i++){
           sum = a[i]+sum;
        }
        int avg = sum/size;
        System.out.println("Average of array element "+ sum);
        System.out.println("Average of array element "+ avg);
    }
}
