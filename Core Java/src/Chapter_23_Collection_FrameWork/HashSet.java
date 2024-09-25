package Chapter_23_Collection_FrameWork;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
public class HashSet {
    public static void main(String[] args) {
        Set<String> hash_Set = new java.util.HashSet<String>();

        // Adding elements to the Set
        // using add() method
        hash_Set.add("learn");
        hash_Set.add("coding");
        hash_Set.add("daily");
        hash_Set.add("two");
        hash_Set.add("hours");

        System.out.println(hash_Set);

        // Creating an object of Set class
        // Declaring object of Integer type
        Set<Integer> a = new java.util.HashSet<Integer>();

        // Adding all elements to List
        a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

        // Again declaring object of Set class
        // with reference to HashSet
        Set<Integer> b = new java.util.HashSet<Integer>();

        b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));


        // To find union
        Set<Integer> union = new java.util.HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new java.util.HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new java.util.HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);

        System.out.println("Iterating over set:");

        Iterator<String> i = hash_Set.iterator();

        while (i.hasNext()){
            System.out.println("hello "+i.next());
        }
        Set<Integer> c = new java.util.HashSet<Integer>();
        c.add(2);
        Iterator<Integer> It = c.iterator();
        System.out.println(It.hasNext());
        while (It.hasNext()){
            System.out.println(It.next());
        }
    }
}
