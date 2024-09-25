package Chapter_11_OOPS.Chapter_04_Encapsulation;
class Student{
    private String name;
    // creating getter method
    public String getName(){
        return name;
    }
    // setter method for name
    public void setName(String name){
        this.name = name;
    }
}
public class Encapsulation_01 {
    public static void main(String[] args) {
        // //creating instance of the encapsulated class
        Student s = new Student();
        //setting value in the name member
        s.setName("Naveen");
        // getting value from getter method
        System.out.println(s.getName());
    }
}
