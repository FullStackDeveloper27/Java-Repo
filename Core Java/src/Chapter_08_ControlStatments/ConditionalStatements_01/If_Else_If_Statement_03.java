package Chapter_08_ControlStatments.ConditionalStatements_01;

import java.util.Scanner;

public class If_Else_If_Statement_03 {
    public static void main(String[] args) {
        int marks;
        System.out.println("Enter Marks ");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        if(marks>80){
            System.out.println("You Got A Grade");
        } else if (marks <80 && marks >60 ) {
            System.out.println("You Got B Grade");
        }else {
            System.out.println("You Got C Grade");
        }
    }
}
