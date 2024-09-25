### What is Inner Class?
Class which is declared inside another class is called Inner class.

* Types of inner class
  - Nested Inner Class
  - Local Inner Class
  - Anonymous Inner Class
  - Static Inner Class

### Nested Inner Class

```java
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
```

Nested classes represent a particular type of relationship that is it can access all the members (data members and methods) of the outer class, including private.
Nested classes are used to develop more readable and maintainable code because it logically group classes and interfaces in one place only.
Code Optimization: It requires less code to write.