package Chapter_09_Arrays.Arrays.Two_Dimension_Problems;

public class Adding_Two_Matrix {
    public static void main(String[] args) {
        int A [][] = {{3,5,9},{2,4,7},{3,4,6}};
        int B [][] = {{8,5,7},{8,3,0},{3,7,4}};
        int c [][] = new int[3][3];
        for (int i=0;i<A.length;i++){
            for (int j=0;j<A[0].length;j++){
                System.out.print((c[i][j] = A[i][j]+B[i][j])+" ");
            }
            System.out.println("");
        }

//        for (int x[]:c){
//            for (int y :x){
//                System.out.print(y+" ");
//            }
//            System.out.println("");
//        }
    }
}
