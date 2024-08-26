package Java_Problems;

import java.util.Scanner;

public class Problem_01_Odd_Or_Evn_Number {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        n = sc.nextInt();
        if(n%2==0){
            System.out.println("Your Number is Even Number");
        }else {
            System.out.println("your Number is Odd Number");
        }
    }
}
