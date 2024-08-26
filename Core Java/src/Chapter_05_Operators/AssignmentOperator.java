package Chapter_05_Operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        System.out.println("Assignment Operator");
        int a = 20;
        int b = 2;
        int c = a+=b;
        int d = a-=b;
        int e = a*=b;
        int f = a/=b;
        int g = a%=b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
