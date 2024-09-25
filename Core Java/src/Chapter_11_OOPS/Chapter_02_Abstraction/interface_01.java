package Chapter_11_OOPS.Chapter_02_Abstraction;

interface Test{
    void meth1();
    void meth2();
}
// creating class, and we should not use extend it will throw an error.
class My implements Test{

    @Override
    public void meth1() {
        System.out.println("meth1 of my class");
    }

    @Override
    public void meth2() {
        System.out.println("meth2 of my class");
    }
    public void meth3(){
        System.out.println("meth3");
    }

}
public class interface_01 {
    public static void main(String[] args) {
        // you can create a reference, but you cannot create  an object
//        Test t = new Test()
        // interface are meant for run time polymorphism
        Test t = new My();
        t.meth1();
        t.meth2();

    }
}
