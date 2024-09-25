package Chapter_17_Exception_Handling;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        int i,j=0;
        try{
            i = 90/j;
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){ //Compiletime Error: Unreachable catch block for ArithmeticException.
            // It is already handled by the catch block for Exception
            System.out.println(e.getMessage());
        }finally {
            System.out.println("The finally block code is always executed regardless exception is occurred or not, exception handled or not");
        }
    }
}
