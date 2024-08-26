package Chapter_08_ControlStatments.JumpStatement_03;

public class Break_01 {
    public static void main(String[] args) {
        for(int i =0; i<10; i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
    }
}
