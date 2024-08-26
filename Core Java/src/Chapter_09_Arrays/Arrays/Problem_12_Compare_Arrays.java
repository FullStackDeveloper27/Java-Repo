package Chapter_09_Arrays.Arrays;

import java.util.Arrays;

public class Problem_12_Compare_Arrays {
    public static void main(String[] args) {
        //1. == --> will check only reference variable like A1 and A2 are reference are not equals
        //2. equals --> predefined method -- This will check only data in side the array
        int[] A1 = {3,9,7,8,12,6,15,5,4,10};
        int[] A2 = {3,9,7,8,12,6,15,5,4,10};
        if(A1==A2){
            System.out.println("Both are Equals");
        }else {
            System.out.println("Both are Not Equals");
        }

        if(Arrays.equals(A1,A2)){
            System.out.println("Both are Equals");
        }else {
            System.out.println("Both are Not Equals");
        }

    }
}
