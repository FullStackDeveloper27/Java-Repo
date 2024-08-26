package Chapter_08_ControlStatments.LoopingStatement_02;

public class For_Each_Loop_05 {
    public static void main(String[] args) {
        int [] brr = new int[5];
        int c = 10;
        for (int i =0;i<5;i++){
            brr[i]=c;
            c = c+10;
        }
        for (int data:brr){
            System.out.println(data);
        }
    }
}
