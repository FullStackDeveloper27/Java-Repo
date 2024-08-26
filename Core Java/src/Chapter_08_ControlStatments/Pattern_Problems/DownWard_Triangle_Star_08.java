package Chapter_08_ControlStatments.Pattern_Problems;

public class DownWard_Triangle_Star_08 {
    public static void main(String[] args) {
        for (int i=4;i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
