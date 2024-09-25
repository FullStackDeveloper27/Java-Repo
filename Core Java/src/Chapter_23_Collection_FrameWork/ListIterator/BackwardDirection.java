package Chapter_23_Collection_FrameWork.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BackwardDirection {
    public static void main(String[] args) {
        // Iterator List in Backward Direction using hasPrevious() and previous() methods.
        List<Integer> list = new ArrayList<>();
        for (int i =1;i<=5;i++){
            list.add(i);
        }
        System.out.println(list);
        ListIterator<Integer> it = list.listIterator(list.size());
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
