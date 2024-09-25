package Chapter_23_Collection_FrameWork.List;

import java.util.ArrayList;

public class List_01_ArrayListDemo {
    public static void main(String[] args) {
        // creating arraylist
        ArrayList<Integer> arr = new java.util.ArrayList<Integer>();
        // inserting elements into it.
        for (int i=1;i<=5;i++){
            arr.add(i);
        }
        System.out.println("List Value "+ arr);
        System.out.println("Size of List "+ arr.size());
    }
}
