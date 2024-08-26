package Chapter_08_ControlStatments.Pattern_Problems;

public class Pyramid_star_03 {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++) {
           for (int space=3; space>=i; space--){
               System.out.print(" ");
           }
           for (int j = 1; j<=i; j++ ){
               System.out.print("* ");
           }
            System.out.println();
        }
    }
}


//        for (int i = 1; i <= 4; i++) {
//            for (int space = 4; space >= 1; space--)
//            {
//                if (space > i) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print(" *");
//                }
//            }
//            System.out.println();
//        }