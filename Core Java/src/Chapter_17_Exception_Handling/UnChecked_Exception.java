package Chapter_17_Exception_Handling;
class UnChecked{
    int a =10;
    int b = 0;
    public void DemoUnCheckedException(){
        int result = a/b;
        System.out.println(result);
    }
}
public class UnChecked_Exception {
    public static void main(String[] args) {
        UnChecked uc = new UnChecked();
        uc.DemoUnCheckedException();
    }
}
