### What is Array?
* Array	is a collection	of	similar	data elements.
### Syntax:
* datatype variable_name []; 
* datatype [] variable_name;

#### Example:
1. int A[] = new int[5]; // creating an array with single dimension array and we can call it has dynamic array.
2. int B[] = {1,2,3,4,5}; // declaring an array with initialization value
3. int C[]; // Declaring a reference
4. c = new int[5]; // Assign array object to the reference
5. int[] D = new int[5];

* In java the array	size	is	given	after	creating	the	new	object.
  - As	int	A[]=	new	int[5];
  - Where	A[]	is	the	reference	and	int[5]	is	the	object.
  - Where	object	is	created	in	the	heap.
  -And	the	reference	is	either	in	stack	or	heap.


* Types of arrays?
  - Single Dimensional array?
  - Multi Dimensional array? --> matrix in row and columns

### Single Dimensional Array?

Example : Static Array
```java
public class Problem_01_Static_Array {
    public static void main(String[] args) {
        int A [] = {3,9,7,8,12,6,15,5,4,10};
        // Accessing array element
        System.out.println(A[0]);
        System.out.println(A[1]);
        System.out.println(A[2]);
        System.out.println(A[3]);
        // Accessing array with for loops
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+",");
        }
        System.out.println("");
    }
}
```
Example : Dynamic Array
```java
import java.util.Scanner;

public class Problem_02_Dynamic_Array {
    public static void main(String[] args) {
        int Size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array ");
        // we can decide the size of array at runtime
        Size = sc.nextInt();
        int A[] = new int[Size];
        for (int i=0;i<Size;i++){
           A[i]= sc.nextInt(); // A[i] we are storing array element
        }
        // printing array element
        System.out.println("Printed Element");
        for(int X:A){
            System.out.print(X+",");
        }
        System.out.println("");
    }
}
```

### How do you access the array element?
* To Access element in array we will be using index value.
```
int A [] = {3,9,7,8,12,6,15,5,4,10};
// Accessing array element
System.out.println(A[0]);
System.out.println(A[1]);
```
* What is Property to check length of array?
  - Every	array	in	java	has	length	as	its	property	which	can	be	accessed
    by using “**array-name.length**"

*  what are most commonly used in array?
    - For	loops	are	most	frequently	used	for	arrays
    - Using	for	loop all the	elements	in	the	arrays	can	be	accessed/
    -  elements	in	array	can	be	transverse	using	arrays

* Types of for loops in array?
  - for loop --> By using for loop we can modify the element in the array.
  - for each loop --> By using for each loop we can only read the values in forward direction.
  
### For	each loop:syntax						
```
for(type var:array)
{
Statements using var;
}	
```

### For	loop:syntax
```
for (int i = 0; i < B.length; i++) {
  System.out.println(B[i]);
}	
```
### Example:

```java
public class Arrays {
    public static void main(String[] args) {
        // creating array and initializing the values
        int B [] = {2,3,4,5,6,7};

        // for loop
        for (int i=0; i<B.length;i++){
            System.out.println(B[i]);
        }
        // for each loop
        for (int j : B) {
            System.out.println(j);
        }

        // modifying the array element using for loop. we cannot modify the array element using for each loop we can only read the element.
        for (int i=0; i<B.length;i++){
            System.out.println(B[i]++);
        }
        // printing the modified array values
        for (int i=0; i<B.length;i++){
            System.out.println(B[i]);
        }

        // length property to check the size of array
        System.out.println(B.length);

        System.out.println(B); // [I@49e4cb85 --> [ array, I --> Integer, 49e4cb85 --> code for single dimension

    }
}
```

### Multi-Dimensional ARRAY

* Two-dimensional	array	are	suitable	for	matrices	and	tabular	form.
* Syntax	for	creating	two-dimensional	array	in	java	is		
	**int	A[][]	=	new	int	[3][4]**.
* It	is	also	known	as	array	of	arrays	or	collection	of	arrays
*  Object	is	created	In	heap	but	the	reference	may	or	may	not	be	created
in	heap.
* Array_name.length	gives	number	of	rows.
* Array_name[index].length	gives	the	number	of	columns.
Example	program:	

### How to create with Two-Dimensional array?
1. int A[][] = new int[3][4]; // creating an array with Two-Dimensional array. Dynamic values
2. int B[][] =  {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; // declaring an array with initialization value
3. int C[][]; // Declaring a reference
4. c = new int[3][4]; // Assign array object to the reference

### How to access the Two-Dimensional array element?
* To access Two Dimensional array we can use for loop and for each loop.
```java
public class TwoDimension_Array {
  public static void main(String[] args) {
    //Two-dimensional array	are	suitable for matrices and tabular form
    //Creating an array we have different methods
    // int A[][] = new int[3][4];
    int A[][] = {{1,2,3,4},{5,6,7,8},{1,2,3,4}};
    // accessing array we have to use for loop
    // this for loop to access rows
    for(int i=0;i<A.length;i++){
      for (int j=0;j<A[0].length;j++){
        System.out.print(A[i][j]+" ");
      }
      System.out.println("");
    }

  }
}
```
### for each loop
* for	each	loop	the	array	have	no	integer	elements	but	the	reference
elements.
* Syntax	of	for	each	loop	for	two-dimensional	array
```
  for(type var :array)
  {
    for(type var1 :type	var)
    {
      Statements using							
    var(type var 1);
    }
  }	
```
Example
```java
public class TwoDimension_Array {
  public static void main(String[] args) {
    //Two-dimensional array	are	suitable for matrices and tabular form
    //Creating an array we have different methods
    // int A[][] = new int[3][4];
    int A[][] = {{1,2,3,4},{5,6,7,8},{1,2,3,4}};
    // accessing array we have to use for each loop
    for(int x[] : A){
      for (int y : x){
        System.out.print(y+" ");
      }
      System.out.println("");
    }
  }
}
```

### Jagged	array
* which mean columns can be different size in the two dimension.
* Jagged	array	is	a	type	of	array	in	which	the	members	are	of	different
    sizes.
* In	jagged	array	the	members	of	arrays	are	created	separately
  according	to	their	sizes	using	their	indices.
```
int A[][];
A = new int[3][]; // created two dimension array we have metioned 3 rows and empty columns
// now assigning the different values in columns
A[0] = new int[2];
A[1] = new int[3];
A[2] = new int[4];
```
* Example
```java

public class Jagged_Array {
  public static void main(String[] args) {
    int A[][];
    A = new int[3][];
    A[0] = new int[5];
    A[1] = new int[3];
    A[2] = new int[2];

//        for (int i=0;i<A.length;i++){
//            for(int j=0; j<A[i].length;j++){
//                System.out.print(A[i][j]+" ");
//            }
//            System.out.println("");
//        }
    for (int x[] : A){
      for(int y : x){
        System.out.print(y+" ");
      }
      System.out.println("");
    }
  }
}

```

### Static Methods in Arrays
If method is static then you don't need to create an object in the array.
1. toString()
2. asList()
3. deepToString()