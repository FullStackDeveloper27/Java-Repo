package Chapter_08_ControlStatments.ConditionalStatements_01;

import java.util.Scanner;

public class If_Statement_01 {
    public static void main(String[] args) {
        // if Statement is used when you want to check an condition.
        int age;
        System.out.println("Enter Your Age ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age > 18){
            System.out.println("Your Are Eligible to Vote ");
        }
        System.out.println("Thank You");
    }
}
