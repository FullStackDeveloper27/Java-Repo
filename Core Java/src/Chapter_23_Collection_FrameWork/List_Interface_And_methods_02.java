package Chapter_23_Collection_FrameWork;

import java.util.ArrayList;
import java.util.List;

public class List_Interface_And_methods_02 {
    public static void main(String[] args) {
        // Create a List of Integer
        List<Integer> list = new ArrayList<Integer>();
        list.add(0,1); // index 0 and element 1
        list.add(1,0); // index 1 and element 0
        list.add(1,2); // index 1 and element 0
        // Displaying the List
        System.out.println("List elements: " + list); // List elements: [1, 0]

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println(list2); // [1, 2, 3]

        // Will add list list2 from 1 index in list
        list.addAll(1,list2);

        System.out.println(list); // [1, 1, 2, 3, 0]

        // Removes element from index 1
        list.remove(1);

        // Printing the updated List
        System.out.println(list); // [1, 2, 3, 0]

        // Prints element at index 3 in list 1
        // using get() method
        System.out.println(list.get(3)); // 0

        // Replace 0th element with 5
        // in List 1
        list.set(0, 5);

        // Again printing the updated List 1
        System.out.println(list); // [5, 2, 3, 0]

        int index = list.indexOf(2);
        System.out.println("The first occurrence of 2 is at index :"+ index); // 1

        int lastIndex = list.lastIndexOf(2);
        System.out.println("The last occurrence of 2 is at index :"+ lastIndex); // 1

        System.out.println(list.get(2));

        System.out.println(list.contains(2));

        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+",");
        }
        for (Integer integer : list) {
            System.out.print(integer + ",");
        }
    }
}
