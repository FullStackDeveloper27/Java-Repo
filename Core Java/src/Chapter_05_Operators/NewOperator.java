package Chapter_05_Operators;

public class NewOperator {
    public static void main(String[] args) {
        System.out.println("new operator");
        //new operator is used to create the object.
        // we can create an object for both user defined class and predefined class
        // creating an object is nothing but allocating the memory so tat we can use in the application
        // once object is created the object will be allocated inside the HEAP Memory of JVM

        // . Operator used to access the member of the class using reference variable.

        // newOperator is reference variable
        NewOperator newOperator = new NewOperator();
        newOperator.m1();
    }
    public void m1(){
        System.out.println("New Method");
    }
}
