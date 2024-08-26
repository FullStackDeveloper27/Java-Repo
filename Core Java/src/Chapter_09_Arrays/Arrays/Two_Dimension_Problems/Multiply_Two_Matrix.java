package Chapter_09_Arrays.Arrays.Two_Dimension_Problems;

public class Multiply_Two_Matrix {
    public static void main(String[] args) {
        int A [][] = {{3,5,9},{2,4,7},{3,4,6}};
        int B [][] = {{8,5,7},{8,3,0},{3,7,4}};
        int c [][] = new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++)
            {
                c[i][j]=0;
                for (int k=0;k<3;k++){
                   c[i][j] = c[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        for (int x[]:A){
            for (int y : x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
