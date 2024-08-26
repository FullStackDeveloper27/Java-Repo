### What are methods?

* Method is a block of code which only runs when it is called.
* You can pass data, known as parameters, into a method.
* Methods are used to perform certain actions, and they are also known as functions.
* When	a	method	returns	a	value	then	the	method	itself	takes	the
  value
* A	method	will have its own copy of variable

### Why use methods? 
* To reuse code: define the code once, and use it many times.

Syntax
```

returnType methodName(parameter	list)
{	
    --------------	
	--------------	
}	
```
Example:
```java
class test
{
     static int max() // method created and called inside the main method
     {
     }
     public static void main(String args[])
     {
         max(); // calling the method
     }
}
```
* max is a method name.
* static means that the method belongs to the Main class and not an object of the Main class.
* void means that this method does not have a return value

### Parameters and Arguments passing in java.

* Parameters act as variables inside the method.
* Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

Example:
```java
class test
{
 static int add(int x, int y) // called method inside the main method and (x,y) are formal parameter
 {
     int z;
     z=x+y;
     return z;
 }
 public static void main(String args[])
 {
     int a=10,b=5,c;
     c=add(a,b); // calling method and (a,b) is actual parameter
     System.out.prinlt(c);
 }
}
```
* Whoever is	calling	a	method	is	called	as	a	caller	or	a	method	call.
* The	method	which	is	called	by	a	caller	is	known	as	called	method.	
* The	parameters/arguments	passed	in	calling	method	are	called	as
  actual	parameters.	
* And	the	parameters	of	a	called	method	are	called	as	formal
  parameters.	
* Formal	parameters	are	nothing	but	input	into	a	method	where	the
  return	type	is	known	as	output	to	a	method
* The	contents	of	actual	parameters	are	copied	in	formal	parameters	is
  the	only	method	of	parameter	passing	in	java
* Passing	of	objects	also	follow	the	same	method
* Parameter	passing	for	primitive	datatypes	the	values	are	copied	in
  formal	parameters,	whereas	in	parameter	passing	of	objects	the
  reference	of	the	object	id	is	copied	in	formal	parameters
* In	short	the	primitive	datatypes	are	passed	by	value	and	the	objects
  are	passed	by	reference.	

### Passing object or reference as parameters:

Example:
```java
class test
{
 static void update(int A[]) // called in main method
 {
    A[0]=25;
 }
 public static void main(String args[])
 {
   int A[]={2,3,4,5,6}; // A[] is reference and {} --> this is object
   update(A); // calling update method
   System.out.println(A[0]);
 }
}
```
* To	call	a	method	from	main	method	it	is	needed	to	be	maid	static.	
* When	the	method	is	called	the	value	of	actual	parameters	are	copied
  in	formal	parameters	which	is	the	only	parameter	passing	method	in
  java.	
* The	address	of	object	in	formal	and	actual	parameter	is	Same.
* String	cannot	be	modiIied	as	it	is	immutable
* A	method	can	also	return	an	object
* A	method	can	have	its	object	as	the	return	type.	

### Method overloading
* multiple methods can have the same name with different parameters

Syntax
```
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)
```
Example
```java

public class Method_04_Method_Overloading {
    static int add(int x,int y){
        if(x>y){
            return x;
        }else {
            return y;
        }
    }
    static float add(float x, float y){
        if(x>y){
            return x;
        }else {
            return y;
        }
    }
    static int add(int x,int y,int z){
        if(x>y && x>z){
            return x;
        }else if(y>z) {
            return y;
        }else {
            return z;
        }
    }

    public static void main(String[] args) {
        // to access method in main method we need to create static before the methods.
        System.out.println(add(2,4));
        System.out.println(add(2.5f,3.2f));
        System.out.println(add(2,3,4));
    }
}

```
* Compiler	will	call	the	corresponding	method	depending	upon	the
  parameter	list.	

### Variable arguments:
* It	is	nothing	but	writing	a	single	method	which	can	run	for	number	of
parameters	of	same	data	types.
* For	example	–	void	show(int	…x)		
* Where	…	represents	the	variable	arguments.
* It	is	similar	to	ellipsis	in	c/c++.
* The	parameters	passed	are	converted	into	an	array.
* The	parameters	can	be	directly	passed	using	an	anonymous	array.
* Variable	argument	should	always	be	the	last	parameter.
* Printf	is	based	on	variable	arguments	in	version	1.7	java.	

```java
public class Method_07_Variable_Arguments {
    static void show(int ...A){
        for (int x:A){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        show(1);
        show(1,2,4);
        show(new int[]{2,3,4,56,7,8,8,2});

     }
}
```