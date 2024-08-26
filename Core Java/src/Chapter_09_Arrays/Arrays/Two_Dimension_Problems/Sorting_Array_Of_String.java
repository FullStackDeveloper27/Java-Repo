package Chapter_09_Arrays.Arrays.Two_Dimension_Problems;

public class Sorting_Array_Of_String {
    public static void main(String[] args) {
        String[] arr = {"Python","Java","HTML","CSS","JS"};
        java.util.Arrays.sort(arr);
        for (String x : arr){
            System.out.println(x);
        }
    }
}
