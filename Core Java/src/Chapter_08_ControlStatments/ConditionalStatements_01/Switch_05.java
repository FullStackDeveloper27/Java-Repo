package Chapter_08_ControlStatments.ConditionalStatements_01;

import java.util.Scanner;

public class Switch_05 {
    public static void main(String[] args) {
        // Switch Statement is used to check the multiple choice decision-making selection statement.
        // In Switch Statement when you want select only one case out of multiple cases.
        int a = 10,b=20;
        System.out.println("Enter number to Choice ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch(ch){
            case 1 :
                System.out.println("Sum " + (a + b));
                break;
            case 2 :
                System.out.println("sub " + (a - b));
                break;
            case 3:
                System.out.println("mul " + (a * b));
                break;
            default:
                System.out.println("Invalid Number");
        }

    }
}
