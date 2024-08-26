package Java_Problems;

import java.util.Scanner;

public class Problem_03_Sum_Of_First_N_Natural_Numbers {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number ");
        n = sc.nextInt();
        // calculate sum creating variable called sum
        int sum =0;
        for (int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("Sum Of First N Natural Numbers " + sum);
    }
}
