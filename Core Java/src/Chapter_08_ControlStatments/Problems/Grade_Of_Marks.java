package Chapter_08_ControlStatments.Problems;

import java.util.Scanner;

public class Grade_Of_Marks {
    public static void main(String[] args) {
        int m1,m2,m3;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Marks of Maths");
        m1= s.nextInt();
        System.out.println("Enter Marks of Science");
        m2= s.nextInt();
        System.out.println("Enter Marks of Biology");
        m3= s.nextInt();
        float avg = (float)(m1+m2+m3)/3;
        if(avg>=70){
            System.out.println("A Grade");
        } else if (avg>=60) {
            System.out.println("B Grade");
        } else if (avg>=50) {
            System.out.println("C Grade");
        }else if(avg>=40){
            System.out.println("D Grade");
        }else{
            System.out.println("Failed");
        }
    }
}
