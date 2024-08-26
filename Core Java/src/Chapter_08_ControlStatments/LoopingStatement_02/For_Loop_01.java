package Chapter_08_ControlStatments.LoopingStatement_02;

public class For_Loop_01 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] =10;
        arr[1] =10;
        arr[2] =10;
        arr[3] =10;
        arr[4] =10;

        for(int i=0; i<5; i++){
            System.out.println(arr[i]);
        }

        int[] brr = new int[5];
        int c = 10;
        // soring array value
        for(int i=0; i<5; i++){
            brr[i] = c;
            c = c+10;
        }
        // printing array value
        for(int i=0; i<5; i++){
            System.out.println(brr[i]);
        }
    }
}
