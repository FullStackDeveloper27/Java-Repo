package Chapter_08_ControlStatments.Pattern_Problems;

public class Left_Triangle_Number_pattern_05 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
