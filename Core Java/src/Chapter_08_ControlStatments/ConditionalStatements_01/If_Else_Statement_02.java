package Chapter_08_ControlStatments.ConditionalStatements_01;

import java.util.Scanner;

public class If_Else_Statement_02 {

    //* It is used to check or execute two statement either if statement or else statement for a single condition

    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>18){
            System.out.println("Your are eligible to vote, Than you");
        }else {
            System.out.println("Your are not eligible to vote, Try Next Year Thank you");
        }
    }
}
