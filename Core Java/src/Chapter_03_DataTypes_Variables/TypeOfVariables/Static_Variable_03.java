package Chapter_03_DataTypes_Variables.TypeOfVariables;

public class Static_Variable_03 {

    // age  variable is a private static variable
    private static int age;

    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development ";

    public static void main(String args[]) {
        age = 25;
        System.out.println(DEPARTMENT + "age :" + age);
    }
}
