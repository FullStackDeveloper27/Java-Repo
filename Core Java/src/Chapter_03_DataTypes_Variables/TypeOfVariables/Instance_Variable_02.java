package Chapter_03_DataTypes_Variables.TypeOfVariables;

public class Instance_Variable_02 {

    // This is instance variable and visible for any child class
    public String LastName;

    // This is instance variable and visible in lastName class only.
    private String FirstName;

    // The LastName Variable assign in the Constructor
    public void LastName(String lastName){
        LastName = lastName;
    }

    // The FirstName variable is assigned a value.
    public void FirstName(String firstName){
        FirstName = firstName;
    }

    public void printFullName(){
        System.out.println("FirstName " + FirstName );
        System.out.println("LastName " + LastName );
    }
    public static void main(String[] args) {
        Instance_Variable_02 instance_variable_03 = new Instance_Variable_02();
        instance_variable_03.LastName("Naveen");
        instance_variable_03.FirstName("Rapelly");
        instance_variable_03.printFullName();
    }


}
