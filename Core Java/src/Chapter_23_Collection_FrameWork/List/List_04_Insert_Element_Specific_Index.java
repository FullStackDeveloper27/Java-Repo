package Chapter_23_Collection_FrameWork.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_04_Insert_Element_Specific_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("List "+ list);
        System.out.println("Enter index to insert");
        int loc = sc.nextInt();
        if(loc>=0 && loc<list.size()){
            System.out.println("Enter element to insert");
            int ele = sc.nextInt();
            list.add(loc,ele);
            System.out.println("List value "+list);
        }else {
            System.out.println("invalid index");
        }
    }
}

