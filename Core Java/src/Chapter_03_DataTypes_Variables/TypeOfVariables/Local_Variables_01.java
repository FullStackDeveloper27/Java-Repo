package Chapter_03_DataTypes_Variables.TypeOfVariables;

public class Local_Variables_01 {

    // creating method
    public void fun(){
        int a = 10; // local variable inside the fun() method, its scope is limited to only this method
        System.out.println(a);
    }

    public void Age(){
        int age; // this is also local variable but value is not initializing, so it would give an error at the time of compilation
        // value = age + 10;
        // System.out.println(value);
    }
    public static void main(String[] args) {
        // to access the method we need to create a object
        Local_Variables_01 variables_02 = new Local_Variables_01();
        // calling the method using object
        variables_02.fun();
        variables_02.Age();
    }
}
