package Chapter_23_Collection_FrameWork;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        // Size of ArrayList
        int n = 5;
        // Declaring the List with initial size n
        List<Integer> arraylist = new java.util.ArrayList<Integer>(n);
        // Appending the new elements at the end of the list
        for (int i=1;i<=n;i++){
            arraylist.add(i);
        }
        // Printing elements
        System.out.println(arraylist);

        // Remove element at index 3
        arraylist.remove(3);

        // Displaying the list after deletion
        System.out.println(arraylist);

        // Printing elements one by one
        for (int i=0;i<arraylist.size();i++){
            System.out.println(arraylist.get(i)+" ");
        }
    }
}
