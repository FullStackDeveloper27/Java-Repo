package Chapter_16_Access_modifier;

import Chapter_16_Access_modifier.mypack1.Dem01;

public class Test {
    public static void main(String[] args) {
        Dem01 d = new Dem01();
        d.display();
        System.out.println(d.b);
    }
}
