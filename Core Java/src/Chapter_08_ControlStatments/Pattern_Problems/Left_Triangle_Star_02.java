package Chapter_08_ControlStatments.Pattern_Problems;

public class Left_Triangle_Star_02 {
    public static void main(String[] args) {
        // for loop for rows
        for (int i=1; i<=5; i++)
        {
            // for loop for space
            for (int space=3; space >= i; space--)
            {
                System.out.print(" ");
            }
            //end space loop
            //for loop for column
            for (int j=1; j<=i; j++ )
            {
                System.out.print("*");
            }
            // end loop for column
            System.out.println();
        }
    }
}
