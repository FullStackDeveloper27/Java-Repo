package Chapter_08_ControlStatments.Pattern_Problems;

public class Right_Triangle_Star_01 {

    public static void main(String[] args) {
        int row = 5;
        // work for i row
        for(int i =1; i<=row; i++){
            // work for J column
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
