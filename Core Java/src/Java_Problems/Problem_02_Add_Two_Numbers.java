package Java_Problems;

import java.util.Scanner;

public class Problem_02_Add_Two_Numbers {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Value ");
        a = sc.nextInt();
        System.out.print("Enter B Value ");
        b = sc.nextInt();
        System.out.print("Addition of Two Numbers "+ (a+b));
    }
}
