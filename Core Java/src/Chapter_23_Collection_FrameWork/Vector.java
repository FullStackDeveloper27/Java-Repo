package Chapter_23_Collection_FrameWork;

import java.util.List;

public class Vector {
    public static void main(String[] args) {
        // Size of ArrayList
        int n = 5;
        // Declaring the List with initial size n
        List<Integer> v = new java.util.Vector<Integer>(n);
        // Appending the new elements at the end of the list
        for (int i=1;i<=n;i++){
            v.add(i);
        }
        // Printing elements
        System.out.println(v);

        // Remove element at index 3
        v.remove(3);

        // Displaying the list after deletion
        System.out.println(v);

        // Printing elements one by one
        for (int i=0;i<v.size();i++){
            System.out.println(v.get(i)+" ");
        }
    }
}
