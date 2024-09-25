package Chapter_11_OOPS.Chapter_03_Inheritance;

class Animals{
    void eat(){System.out.println("eating...");}
}
class Dogs extends Animals{
    void bark(){System.out.println("barking...");}
}
class Cat extends Animals{
    void meow(){System.out.println("meowing...");}
}
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.meow();
        c.eat();
//c.bark();//C.T.Error
    }
}
