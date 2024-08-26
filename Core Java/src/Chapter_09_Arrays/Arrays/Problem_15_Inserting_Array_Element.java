package Chapter_09_Arrays.Arrays;

import java.util.Scanner;

public class Problem_15_Inserting_Array_Element {
    public static void main(String[] args) {
        int size,loc,item;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter search element ");
        size = sc.nextInt();
        int a[] = new int[size+1];
        for (int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Printing element");
        for (int J : a){
            System.out.println(J);
        }
        System.out.println("Enter Array Location ");
        loc=sc.nextInt();
        System.out.println("Enter the item ");
        item = sc.nextInt();
        for (int i=size;i>loc;i--){
            a[i]= a[i-1];
        }
        a[loc] =item;
        size++;
        for (int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}


//    // Inserting an array element
//    int A[] = new int[10];
//        A[0]=1;
//                A[1]=2;
//                A[2]=3;
//                A[3]=4;
//                A[4]=5;
//                A[5]=6;
//                int n=6;
//                for (int i = 0;i<n;i++){
//        System.out.print(A[i]+",");
//        }
//        System.out.println("");
//        int x=20;
//        int index = 2;
//        for (int i=n;i>index; i--){
//        A[i] = A[i-1];
//        }
//        A[index] = x;
//
//        for (int i=0; i<n;i++){
//        System.out.println(A[i]+",");
//        }
//        System.out.println("");