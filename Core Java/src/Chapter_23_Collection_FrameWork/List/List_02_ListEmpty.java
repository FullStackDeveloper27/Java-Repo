package Chapter_23_Collection_FrameWork.List;

import java.util.ArrayList;
import java.util.List;

public class List_02_ListEmpty {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        if(list.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List is not empty");
        }
    }
}
