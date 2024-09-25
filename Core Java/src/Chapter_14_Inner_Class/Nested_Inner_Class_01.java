package Chapter_14_Inner_Class;
class outer{
    int x=10;
    // static data you can access inner class
    static int z =10;
    class Inner{
        int y=20;
        Inner in = new Inner();
        public void innerDisplay(){
            System.out.println(x +" "+ y);
        }
    }
    // creating outer class method
    public void outerDisplay(){
        // creating an object for InnerClass
        Inner in = new Inner();
        // calling an inner class method
        in.innerDisplay();
        System.out.println(in.y); // I can access Inner class data
//      System.out.println(in.x); you can't access the outer class data from inner class.
    }
}
public class Nested_Inner_Class_01 {
    public static void main(String[] args) {
        outer ot = new outer();
        // calling an outer call method then in outer class method we are calling inner class method
        ot.outerDisplay();
        // creating an object for outer class and inner class
        outer.Inner oi = new outer().new Inner();
        oi.innerDisplay();
    }
}
