package Chapter_08_ControlStatments.Problems;

import java.util.Scanner;

public class Person_Young_Or_Not {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age? ");
        age = sc.nextInt();
        if(age>=14 && age<=45){
            System.out.println("He is Young");
        } else if (age<14) {
            System.out.println("He is Child");
        } else {
            System.out.println("He is Not Young");
        }
    }
}
