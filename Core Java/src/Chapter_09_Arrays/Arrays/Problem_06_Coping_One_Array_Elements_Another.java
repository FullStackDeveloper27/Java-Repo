package Chapter_09_Arrays.Arrays;

import java.util.Scanner;

public class Problem_06_Coping_One_Array_Elements_Another {
    public static void main(String[] args) {
        int Size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array ");
        Size = sc.nextInt();
        int A[] = new int[Size];
        for (int i=0;i<Size;i++){
            A[i] =sc.nextInt();
        }
        System.out.println("Printing First Array Element");
        for (int J : A){
            System.out.println(J+" ");
        }
        // Coping Array Element
        System.out.println("Second Array Element");
        int B[] = new int[Size];
        for (int i=0;i<Size;i++){
            B[i]=A[i];
        }
        System.out.println("Printing Second array element");
        for (int J : B){
            System.out.println(J+" ");
        }

    }
}
