package Java_Problems;


import java.util.Scanner;

public class Problem_04_Sum_Of_Odd_Evn_Numbers {
    public static void main(String[] args) {
        int n; int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number ");
        n= sc.nextInt();
        if(n%2==0){
            for (int i=0;i<=n;i=i+2){
                sum = sum + i;
            }
            System.out.println("Sum of Even Numbers "+ sum);
        }else {
            for (int i =1;i<=n;i=i+2){
                sum = sum + i;
            }
            System.out.println("Sum of Odd Numbers "+ sum);
        }
    }
}
