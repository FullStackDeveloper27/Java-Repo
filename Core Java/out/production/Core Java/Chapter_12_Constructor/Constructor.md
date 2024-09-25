### What is Constructor?
* Constructor is a method which is used to initialize the value to an object.
* when ever object is created by using new() keyword at least one constructor is called.
* By Default java compiler provide default constructor.

Note: It is called constructor because it constructs the values at the time of object creation. It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn't have any

* Rules for creating Java constructor
    - Constructor name must be the same as its class name
    - A Constructor will not return any return type
    - A Java constructor cannot be abstract, static, final, and synchronized
    - we can declare access modifier while declaring constructor.

#### Types of constructor.
1. Default constructor
2. Parameterized constructor.

##### 1. Default Constructor

```java
public class Default_Constructor_01 {
    int x;  // Create a class attribute

    // Create a Default class constructor for the Main class will return 0 value
    public int Constructor_01(){
        return x;
    }

    public static void main(String[] args) {
        Default_Constructor_01 c = new Default_Constructor_01();
        System.out.println(c.x); //0
    }
}
```

##### 2. Parameterized constructor.

```java
class Rectangle{
    int length;
    int breath;

    // creating a constructor
    public Rectangle(){
        length=1;
        breath=1;
        // assigning value with constructor
    }
    public Rectangle(int l, int b){
        length =l;
        breath =b;
    }
    public Rectangle(int s){
        length = breath =s;
    }
}
public class Parameterized_Constructor_02 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.length);
        System.out.println(r.breath);
        Rectangle r1 = new Rectangle(10,10);
        System.out.println(r1.length);
        System.out.println(r1.breath);
        Rectangle r2 = new Rectangle(10);
        System.out.println(r2.length);
        System.out.println(r2.breath);

    }
}
```

### Constructor Overloading

* When ever we have more than one class constructor in our class then it is called constructor overloading.

