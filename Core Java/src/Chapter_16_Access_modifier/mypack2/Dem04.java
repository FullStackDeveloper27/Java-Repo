package Chapter_16_Access_modifier.mypack2;

import Chapter_16_Access_modifier.mypack1.Dem01;
//Different Package subclass private and default not accessible
public class Dem04 extends Dem01 {
    public void show(){
        System.out.println(b+c);
    }
}
