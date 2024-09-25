package Chapter_23_Collection_FrameWork.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_03_Display_Specific_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for (int i =1;i<50;i++){
            list.add(i);
        }
        System.out.println("List "+ list);
        System.out.println("Enter index to display value ");
        int indexValue = sc.nextInt();
        try{
            System.out.println("Element index value "+ list.get(indexValue));

        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
    }
}
