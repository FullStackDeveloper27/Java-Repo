package Chapter_08_ControlStatments.JumpStatement_03;

public class Continue_02 {
    public static void main(String[] args) {
        for(int i =0; i<10; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
