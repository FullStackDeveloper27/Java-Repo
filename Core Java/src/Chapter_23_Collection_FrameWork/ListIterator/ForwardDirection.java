package Chapter_23_Collection_FrameWork.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ForwardDirection {
    //Iterator List in Forward Direction using hasNext() and next() methods:
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i =1;i<=5;i++){
            list.add(i);
        }
        System.out.println(list);
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

