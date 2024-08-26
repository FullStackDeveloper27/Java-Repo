package Chapter_09_Arrays.Arrays;

import java.util.Scanner;

public class Problem_16_Delete_Array_Element {
    public static void main(String[] args) {
        int size,loc,item;
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
        System.out.println("Enter Array Location ");
        loc=sc.nextInt();
        for (int i=loc;i<size-1;i++){
            a[i]= a[i+1];
        }
        size--;
        for (int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}
