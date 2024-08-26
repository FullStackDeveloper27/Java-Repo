package Chapter_09_Arrays.Arrays;

import java.util.Arrays;

public class Problem_03_Static_Methods_In_Array {
    public static void main(String[] args) {
        // toString(), asList(), deepToString();

        // This will work in Single Dimension
        // Initializing a string Array
        String a [] = {"Java","Python","JS","LearnCoding"};
        // This method returns a string representation of the contents of the specified array.
        System.out.println("toString method "+Arrays.toString(a));
        // a String type array has been passed as an argument to the Arrays.asList()
        // in Java for converting the array to a list of string elements.
        // asList() creates a list with a fixed size, means that we cannot add an element by add() method in the returned list by Arrays.asList().
        // The asList() method acts as a bridge between an array and a list because the list returned by asList() method cannot extend the size.but can use all other methods of a list
        System.out.println("asList method "+Arrays.asList(a));

        // This will work in Multi Dimension
        int arr[][] = {{10,20},{30,40}};
        System.out.println("deepToString "+ Arrays.deepToString(arr));


        // Predefined static method
        // Sort(), Equals(),copyOf()

        // Sort();
        int[] C = {3,9,7,8,12,6,15,5,4,10};
        Arrays.sort(C); // By Default will sort in Ascending order
        for(int J : C){
           System.out.println(J+" ");
        }
        // Equals() will compare two arrays
        int[] A1 = {3,9,7,8,12,6,15,5,4,10};
        int[] A2 = {3,9,7,8,12,6,15,5,4,10};
        boolean b = Arrays.equals(A1,A2);
        System.out.println("both array are equal "+ b);

        // Equals() will compare two arrays
        int[] A3 = {3,9,7,8,12,6,15,5,4,10};
        int[] A4 = {3,9,7,8,12,4,10};
        boolean b1 = Arrays.equals(A3,A4);
        System.out.println("both array are equal "+ b1);

        //copyOf()
        int[] A5 = {3,9,7,8,12,6,15,5,4,10};
        int[] copy = Arrays.copyOf(A5,11);
        for (int J : copy){
           System.out.print(J+",");
        }
    }
}
