package Chapter_17_Exception_Handling;
public class Try_Catch {
    public static void main(String[] args) {
        int a =10;
        int b = 0;
        try {
            int result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be 0, try again");
        }
        System.out.println("Bye");
    }
}
