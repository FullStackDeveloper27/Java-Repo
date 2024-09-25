package Chapter_14_Inner_Class;
class outerClass{
    // creating method
    public void Display(){
        class InnerClass{
            void InnerDisplay(){
                System.out.println("hello Inner Class");
            }
        }
        InnerClass ic = new InnerClass();
        ic.InnerDisplay();
    }
}
public class Local_Inner_Class_02 {
    public static void main(String[] args) {
        outerClass o = new outerClass();
        o.Display();
    }
}
