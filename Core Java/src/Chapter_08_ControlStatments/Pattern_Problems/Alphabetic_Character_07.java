package Chapter_08_ControlStatments.Pattern_Problems;

public class Alphabetic_Character_07 {
    public static void main(String[] args) {
        int a = 65;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) a + " ");
            }
            a++;
            System.out.println();
        }
    }
}
//    public static void main(String[] args) {
////        int a =65;
//        for(int i = 1; i<=5; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print(j);
//            }
//
//            System.out.println();
//        }
//    }

