package Chapter_08_ControlStatments.LoopingStatement_02;

public class Nested_Loop_04 {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
