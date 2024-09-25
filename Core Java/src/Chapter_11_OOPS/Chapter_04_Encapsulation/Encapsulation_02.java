package Chapter_11_OOPS.Chapter_04_Encapsulation;
class SmartPhone{
    // Make Instance variable Private
    private int storage;
    private String model;
    // Write public setter method with validation checks if necessary

    public void setStorage(int phoneStorage){
        if (phoneStorage<100 || phoneStorage>256){
            storage = 100;
        }else {
            storage = phoneStorage;
        }
    }
    public void setModel(String phoneModel){
        model = phoneModel;
    }
    // Getter method
    public int getStorage(){
        return storage;
    }
    public String getModel(){
        return model;
    }
}
public class Encapsulation_02 {
    // main method
    public static void main(String[] args) {
        // creating an object for smartPhone
        SmartPhone sp = new SmartPhone();
        // calling method setStorage
        sp.setStorage(150);
        // calling method setModel
        sp.setModel("iphone");
        System.out.println(sp.getStorage());
        System.out.println(sp.getModel());

    }
}
