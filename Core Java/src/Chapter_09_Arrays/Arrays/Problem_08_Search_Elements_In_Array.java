package Chapter_09_Arrays.Arrays;

import java.util.Scanner;

public class Problem_08_Search_Elements_In_Array {
//    a[5] = {10,20,30,40,50}
//    Search item 70 --> Item not found
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
        System.out.println("Enter to Search Element in the Array ");
        int n;
        int count =0;
        n= sc.nextInt();
        for (int i=0;i<size;i++){
            if(a[i]==n){
                count++;
            }
        }
        if(count>0){
            System.out.println("Item Found"+count+"time");
        }else{
            System.out.println("Item Not Found");
        }

    }
}


//    // linear search
//    Scanner sc = new Scanner(System.in);
//    int A [] = {3,9,7,8,12,6,15,5,4,10};
//    int key;
//        System.out.println("Enter the key ");
//                key=sc.nextInt();
//                for(int i=0;i<A.length;i++){
//        if(key == A[i]){
//        System.out.println("Element Found at index number:" + i);
//        System.exit(0);
//        }
//        }
//        System.out.println("Not Found");