package Chapter_09_Arrays.Arrays;

import java.util.Scanner;

public class Problem_14_Find_Smallest_Element_In_Array {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter search element ");
        size = sc.nextInt();
        int a[] = new int[size];
        for (int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Printing element");
        for (int J : a){
            System.out.println(J);
        }
        int max = a[0];
        for (int i=0; i<size;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.print("Maximum element " + max);

    }
}
