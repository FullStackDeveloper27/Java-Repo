### what is Polymorphism?
* Polymorphism	is	a	concept	in	which	we	can	execute	a	single operation	in	different	ways.
* polymorphism	is	same	as	generalization

* polymorphism are mainly divided into two types.
  - Compile time polymorphism
  - Run time polymorphism

We can perform polymorphism in java by method overloading and method overriding.

#### What is Compile-Time Polymorphism in Java?
* Compile-Time polymorphism in java is also known as Static Polymorphism. to resolved at compile-time which is achieved through the Method Overloading.
* If you overload a static method in Java, it is the example of compile time polymorphism
#### What is Runtime Polymorphism in Java?
Runtime polymorphism in java is also known as Dynamic Binding which is used to call an overridden method that is resolved dynamically at runtime rather than at compile time. 

```java
package Chapter_11_OOPS.Chapter_05_Polymorphism;
//Java Runtime Polymorphism Example:
class Bank{
    float getRateOfInterest()
    {
        return 0;
    }
}
class SBI extends Bank{
    float getRateOfInterest(){
        return 8.4f;
    }
}
class ICICI extends Bank{
    float getRateOfInterest(){
        return 7.3f;
    }
}
class AXIS extends Bank{
    float getRateOfInterest(){
        return 9.7f;
    }
}
public class polymorphism_01 {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        b=new ICICI();
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
        b=new AXIS();
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
    }
}
```