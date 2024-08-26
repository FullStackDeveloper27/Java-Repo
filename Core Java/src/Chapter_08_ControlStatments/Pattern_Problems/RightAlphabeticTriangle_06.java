package Chapter_08_ControlStatments.Pattern_Problems;

public class RightAlphabeticTriangle_06 {
    public static void main(String[] args) {
        int a =65;
        for(int i = 0; i<=5; i++){
            for(int j = 0; j<=i; j++){
                System.out.print((char)(a+j) + " ");
            }
            System.out.println();
        }
    }
}
