package Chapter_12_Constructor;
public class Default_Constructor_01 {
    int x;  // Create a class attribute

    // Create a Default class constructor for the Main class will return 0 value
    public int Constructor_01(){
        return x;
    }

    public static void main(String[] args) {
        Default_Constructor_01 c = new Default_Constructor_01();
        System.out.println(c.x); //0
    }
}

