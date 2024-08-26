package Chapter_09_Arrays.Arrays.Two_Dimension_Problems;

public class TwoDimension_Array {
    public static void main(String[] args) {
        //Two-dimensional array	are	suitable for matrices and tabular form
        //Creating an array we have different methods
        // int A[][] = new int[3][4];
        int A[][] = {{1,2,3,4},{5,6,7,8},{1,2,3,4}};
        // accessing array we have to use for loop
        // this for loop to access rows
//        for(int i=0;i<A.length;i++){
//           for (int j=0;j<A[0].length;j++){
//               System.out.println(A[i][j]);
//           }
//            System.out.println("\n");
//        }
        // By using for each loop
        // X[] is reference to A
        for(int x[] : A){
            for (int y : x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }


    }
}
