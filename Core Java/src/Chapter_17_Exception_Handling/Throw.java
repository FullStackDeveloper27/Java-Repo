package Chapter_17_Exception_Handling;
// custom exception
class Negative extends Exception{
    public String toString(){
        return "Dimension of Rectangle ";
    }
}

public class Throw {
    static int area(int l, int b) throws Negative {
        if(l<0 || b<0){
            throw new Negative();
        }
        return l*b;
    }
    static void meth1() throws Negative {
        System.out.println("Area "+ area(10,20));
    }
    public static void main(String[] args){
        try{
            meth1();
        }catch (Exception e)
        {
            System.out.println(e);
        }
//        throw new ArithmeticException("The number is divided by zero ");
//        System.out.println("After throw normally your statement will not executed");
    }
}
