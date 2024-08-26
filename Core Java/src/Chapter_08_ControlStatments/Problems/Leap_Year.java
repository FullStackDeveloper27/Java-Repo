package Chapter_08_ControlStatments.Problems;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year? ");
        year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if (year%400==0){
                    System.out.println("It's Leap Year");
                }else{
                    System.out.println("It's not a Leap Year");
                }
            }else{
                System.out.println("It's Leap Year");
            }
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
