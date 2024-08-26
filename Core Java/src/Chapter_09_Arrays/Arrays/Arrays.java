package Chapter_09_Arrays.Arrays;

public class Arrays {
    public static void main(String[] args) {
        // creating array and initializing the values
        int B [] = {2,3,4,5,6,7};

        // for loop
        for (int i=0; i<B.length;i++){
            System.out.println(B[i]);
        }
        // for each loop
        for (int j : B) {
            System.out.println(j);
        }

        // modifying the array element using for loop. we cannot modify the array element using for each loop we can only read the element.
        for (int i=0; i<B.length;i++){
            System.out.println(B[i]++);
        }
        // printing the modified array values
        for (int i=0; i<B.length;i++){
            System.out.println(B[i]);
        }

        // length property to check the size of array
        System.out.println(B.length);

        System.out.println(B); // [I@49e4cb85 --> [ array, I --> Integer, 49e4cb85 --> code for single dimension

    }
}
