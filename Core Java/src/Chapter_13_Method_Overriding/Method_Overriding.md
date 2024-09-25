### What is Method Overriding?

* Method Overriding means re-defining the method of super class into subclass is called method overriding.
* Method	will	be	called	depending	on	the	object.	
* Method	overriding	is	achieved	in	Inheritance.

Example

```java
class Super{
    public void display(){
        System.out.println("Hello Super class");
    }
}
class SubClass extends Super{
    public void display(){
        System.out.println("Hello World SubClass");
    }
}
public class Method_Overriding_01 {
    public static void main(String[] args) {
        // creating an object for super class
        Super su = new Super();
        su.display(); // This will super class method

        // creating an object for subclass
        SubClass sb = new SubClass();
        sb.display(); // this will call subclass method and super class will be shadow for subclass
    }
}

```

* When	the	subclass	object	is	called	then	the	display	method	inherited
from	the	super	class	is	shadowed	and	the	subclass	display	method	is
executed.
* Super	Class	method	never	be	called	upon	the	object	of	Sub	Class.
* In	the	given	example	program	the	super	class	have	a	method	called
display	which	is	saying	hello	and	another	class	subclass	is	taken	where	it
inherits	the	display	method	from	super	class	and	redefines	the	method

#### Dynamic Method Dispatch

* When	a	super	class	reference	holding	the	object	of	subclass	and
  overridden	method	is	called	then	method	of	object	will	be	called	it	is
  Dynamic	Method	Dispatch
* It	is	useful	for	achieving	Runtime	Polymorphism.

```java
// Dynamic Method Dispatch
class Super1
{
    public void meth1() {
        System.out.println("meth1");
    }
    public void meth2() {
        System.out.println("super meth2");
    }
}
class Sub1 extends Super
{
    public void meth2() {
        System.out.println("sub meth2");
    }
    public void meth3() {
        System.out.println("meth3");
    }
}
public class Method_Overriding_02 {
    public static void main(String[] args) {
        // creating an object for subclass
        Super1 su = new Sub1();
        su.display(); // this will call subclass method and super class will be shadow for subclass
    }
}
```

* In	the	given	example	meth2	is	redefined	in	the	subclass.	
* Super	Class	reference	can	have	Object	of	Sub	Class	but	a	Sub	Class	
reference	cannot	have	Super	Class	Object.		
* A	Super	Class	Reference	can	hold	the	Object	of	SubClass, but	it	can	call	only
those	methods	which	are	present	in	super	class.
* Methods	are	called	depending	on	the	object	not	the	reference	then	the
overridden	object	is	called	it	is	Runtime	Polymorphism.
* Dynamic	Method	Dispatch	means	calling	a	Method	dynamically	because
program	make	the	decision	at	runtime	for	which	object	to	be	called

### Dos and Don'ts	of	Overriding	

* Signature	must	be	same	in	method	overriding.
* If	the	method	name	is	different	the	method	is	not	overridden, but	it	is
overloaded.			
* Argument	may	be	different	but	the	parameter	must	be	same.
* Return	type	must	be	same,	if	it	is	not	same	then	the	method	is	neither
overridden	nor	overloaded.
* Final	and	static	methods	cannot	be	overridden.
* Method	can	be	overridden	with	same	or	lenient	(public,	protected)	access
specifiers	but	the	stricter(private)	access	specifiers	cannot	be	used	in	subclass. 

### Polymorphism using Overloading and Overriding
* Polymorphism	is	one	of	the	principles	of	Object-oriented-programming,
* polymorphism	means	one	name	different	actions.
Poly	means	’many’,	morphism	means	’forms’.
* Polymorphism	is	achieved	using	method	overriding	and	overloading.
* In	method	overloading	access	speciPiers,	return	types	are	same	but
number	of	parameters	or	type	of	parameters	are	different.		
* In	overloading	number	or	type	of	argument	will	decide	which	method	is
to	be	called.
* Overloading	is	achieved	in	same	class	whereas	overriding	is	achieved	in
inheritance.
* In	method	overriding	signature	is	same	but	in	overloading	signatures
must	be	different.		
* Method	calls	are	different	in	overriding	it	depends	on	object.		
* Method	overriding	is	used	for	runtime	polymorphism	and	method
overloading	is	used	for	compile	time	polymorphism