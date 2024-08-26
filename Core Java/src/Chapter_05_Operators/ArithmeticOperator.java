package Chapter_05_Operators;

public class ArithmeticOperator {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        System.out.println("Arithmetic Opeator");
        System.out.println("Addition " + (a + b) );
        System.out.println(a-b);
        System.out.println("multiplication " + (a * b));
        System.out.println("division " + (a / b));
        System.out.println("moduler " + (a % b));

        System.out.println("Increment and Decrement");
        System.out.println("post-Increment");
        int c = 20;
        int d = 10;
        System.out.println(c++); // 20 original value is printed
        System.out.println(c); // 21 after increment value

        System.out.println("post-Decrement");
        System.out.println(d--); //10 original value is printed
        System.out.println(d); // 9 after decrement value

        System.out.println("pre-Increment");
        System.out.println(++a); // 11 first increment will happen
        System.out.println(a); // 11

        System.out.println("pre-Decrement");
        System.out.println(--b); // 1 decrement will happen first
        System.out.println(b); // 1
    }
}
