### Static and Final
* we will discuss some topics like
  - static variables
  - static methods
  - static nested class
  - static blocks

### What is Static Keyword?
* Static	Keyword	is	used	for	representing	Metadata	(data	about	data).
* It	is	useful	for	representing	the	information	of	a	class.
### Static Variable
* Static variables or members	belongs	to	a	class, and they	can	be	shared	by	all	the
objects	of	the	class	and	all	the	objects	have	their	own	non-static
members	.
* All	the	object	can	use	the	static	variable	as	a	shared	data.
* Static	members	can	be	accessed	just	by	using	class	name.
* The	static	members	of	a	class	are	created	in	the	method	area.
* Static	methods	can	access	only	static	members
### Static methods
* Static methods belongs	to	a	class, and they	can	be	shared	by	all	the
objects	of the	class.
* Static methods can access by using class name.
* static methods can access only static variables 
* static methods cannot access non-static variables.
### static nested class
* collection of one or more static method and grouping them into one class is called nested class.
* you cannot use this keywords in static methods

```java
package Chapter_15_Static_Final.Static_Final;

class Test {
  //    static variables
  static int price = 10;
  int a = 20;

  // creating non-static method
  void show() {
    System.out.println(price); // In non-static method can access static members data
    System.out.println(price + " " + a); // In non-static method can access static members data and non-static data members
  }

  // static methods can access only static members' data.
  static void display() {
    System.out.println(price);
    //System.out.println(price + " "+a); // here I am trying to access non-static data inside static method that's not allowed
  }

}

public class Static {
  public static void main(String[] args) {
    // creating an object for the class
    Chapter_15_Static_Final.Test t1 = new Chapter_15_Static_Final.Test();
    t1.show();
    // creating another object for same class
    Chapter_15_Static_Final.Test t2 = new Chapter_15_Static_Final.Test();
    t2.show();

    // Now I am changing the value for static data and non-static data
    t1.a = 30;
    t1.show();
  }
}
```
### static blocks
* Set	of	statements	are	written	in	the	form	of	blocks	and	are	made
static.
* It	is	used	to	initialise	static	data	member.
* It	is	executed	before	the	main	method	at	the	time	of	class	sloading.

```java
package Chapter_15_Static_Final.Static_Final;

class mine {
  static int a;

  static {
    System.out.println("block 1");
    a = 10;
  }

  static {
    System.out.println("Block 2");
  }
}

public class static_block {
  public static void main(String[] args) {
    Chapter_15_Static_Final.mine m = new Chapter_15_Static_Final.mine();
    System.out.println("main");
  }
}
```

### What is Final Keyword?
* final keyword is used to make constant values.
  - final variable
  - final method
  - final class
### final variable
* Once you declared a variable using final keyword you can't modify the value.
* Values	of	final	variables	are	fixed,	once	the	value	is	assigned	then	it
  can’t	be	modified.	
* Final	variables	are	written	in	capital	letters.
* Final	variable	can	be	initialised	while	declaring	the	variable,	or	it	can
  be	initialised	in	a	static	block,	or	else	it	can	be	initialised	inside
  constructor	of	a	class.
* As	constructors	can	be	overloaded	then	the	final	variable	must	be
  initialised	in	every	constructor.	

### final method
* final	method	cannot	be	overridden.
### final class
* A	final	class	cannot	be	extended.
```java
package Chapter_15_Static_Final;
//final class TestF{ // you cannot inheritance final class
class TestF{
    public final void show(){
        System.out.println("Hello");
    }
}
class TestS extends TestF{
//    public void show(){} // cannot overide final method
}
public class Final {
    public static void main(String[] args) {
        // creating final variable
        final int a = 10;
        // creating final variable without value assign
        final int b;
        b=20;
        System.out.println(a);
        System.out.println(b);

    }
}
```
### singleton class
* A	class	which	can	create	only	one	object	is	called	singleton	class.
* Constructors	are	made	private	to	and	object	of	the	singleton	class	is
written	in	static	method.
* In	singleton	class	getInstance()	method	is	used.