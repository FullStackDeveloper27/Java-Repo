package Chapter_23_Collection_FrameWork;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection_Interface_methods_01 {
    public static void main(String[] args) {
        Collection<String> c1 = new LinkedList<String>();
        Collection<String> c2 = new LinkedList<String>();
        c1.add("A");
        c1.add("B");
        c1.add("C");
        c1.add("D");
        c1.add("E");
        c1.add("F");
        c2.add("E");
        c2.add("F");
        c2.add("G");
        c2.add("H");
        System.out.println(c1);
        System.out.println(c2);

//        c1.addAll(c2);
//        System.out.println(c1);

//        c1.removeAll(c2);
//        System.out.println(c1); //

//        c1.retainAll(c2);
//        System.out.println(c1); // ["E","F"]


        System.out.println(c1.isEmpty());
        System.out.println(c1.contains("E")); // True
        System.out.println(c1.equals(c2)); // False
        System.out.println(c1.size()); //
        System.out.println(c1.hashCode()); //
        System.out.println(c2.hashCode()); //

        Iterator<String> iter = c1.iterator();
        System.out.println("\nThe iterator values" + " of list are: ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }



    }
}
