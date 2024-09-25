package Chapter_17_Exception_Handling;

//public class Try_Multiple_Catch {
//    public static void main(String[] args) {
//        int i,j=0;
//        try{
//            i = 90/j;
//        }catch (Exception e){
//            System.out.println(e);
//        }catch (ArithmeticException e){ //Compiletime Error: Unreachable catch block for ArithmeticException.
//            // It is already handled by the catch block for Exception
//            System.out.println(e);
//        }
//    }
//}

/**
 * Finally vs System.exit(0); JVM gets normally terminated when System.exit(0);
 * executes. Hence, finally block doesn’t gets executed. Note: System.exit(0);
 * // if we use 0 : Normal termination, For non-zero: abnormal termination o/p:5
 *Finally block doesn’t gets executed.
 */

/**
 * Demo: return statement in all try, cache, finally block.
 * Finally block return statement takes priority.
 */

public class Try_Multiple_Catch {
    public static void main(String[] args) {
        int i,j=0;
        try{
            i = 90/j;
            System.out.println(i);
            System.exit(0);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){ //Compiletime Error: Unreachable catch block for ArithmeticException.
            // It is already handled by the catch block for Exception
            System.out.println(e.getMessage());
        }
    }
}

