### What is OOPS?
* It stands for Object-Oriented Programming
* It is based on object
* it follows bottom up programming approach.
* it is based on real world.
* it provides data hiding so it is very secure
* it provide re-usability feature

### What is a Class?
* A Class is a Collection of objects.
* it is user defined data type that acts as a template for creating objects.
* A large number object can be created using the class.
* Class is consider has blue-print.
* Class does not consume any space in the memory.

// Syntax:
```
class className{
  data members/variables
  methods
}
```
* here variables and methods are represent the state and behaviour of the object respectively.
  - variable are used to store data
  - method are used to perform some operation.
```java
// How to Create a Class
class Circle{
    public double radius; // data members (also Instance variable)
    public double area(){
        return  Math.PI * radius * radius;
    } // method
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
public class Circle1 {
    public static void main(String[] args) {
        Circle cr = new Circle();// creating an object for circle
        cr.radius = 7; // changing the value 
        System.out.println(cr.area());
        System.out.println(cr.perimeter());
        System.out.println(cr.circumference());
    }
}
```

### What is an Object?
* Object are real world entity which have properties and behaviour.
* properties are variables in java.
* behaviors are methods in java.
* Another definition Object is instance of class.
* Object takes some space in the memory.

syntax:
Object obj = new Object(); // creating object

when we create an object by using new keyword, The new keyword is used to allocate memory for an object dynamically and return a reference to it.

eg: Fruit is a class, and it's object are mango and apple and banana

### What is different between a class and object?

| Class                                  | Object                            |
|----------------------------------------|-----------------------------------|
| it is a collection of object           | it is an instance of class        |
| it doesn't take up space in the memory | it take space in memory           |
| class does not exist physically        | object exist physically           |
| class are declared just once           | object are declared when required |

* For	a	single	class	we	can	have	many	objects.
* Multiple	number	of	objects	can	be	created	by	one	single	class

```java
class Television
{ 
    // variables
    int channel;
    int volume;

    public void changechannel(); //methods
    public void changevolume();
}
class test
{
 public static void main()
 {
     //creating object 
 Television t=new Television();
 t.changechannel(10);
 }
}
```
* In	java	there	is	an	area	inside	main	memory	which	is	known	as
  method	area	which	contains	all	the	methods.
* The	definitions	of	the	will	be	present	inside	the	heap,	as	the	objects
  will	be	based	on	the	definitions	so	the	objects	are	also	present	in
  heap.

### What is the difference between a class and a structure?


| Class                                  | Structure                            |
|----------------------------------------|-----------------------------------|
| Class is a collection of objects           | Structure is a collection of variables of different data types under a single unit.        |
| class is used to combine data and methods together. | Structure is used to grouping data.           |
| class objects are created on the heap memory        | Structure object are created on the stack memory           |
| class can inherit another class          | Structure can't inherit another structure |
| a class has all member private by default.          | A Structure has all members public by default. |
| Class are ideal for large or complex objects.         | Structure are ideal for small and isolated model object |
