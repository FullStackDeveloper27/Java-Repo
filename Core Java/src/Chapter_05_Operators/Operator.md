### Arithmetic Operator and expressions:

1. Addition
2. Subtraction
3. Multiplication
4. Division --> Quotient
5. modular --> Remainder, this will work with float 

### Precedence of the Operator

* *,/ % --> High Precedence 
* "+, -" --> Low Precedence

* These	operators	can	be	applied	on	any	type	of	data	except	Boolean.

* %	operator	works	on	float	and	double	data	types	without	taking	the decimal	point	in	quotient	but	the	divisor	and	dividend	contain	the decimal	point.

* To	write	down	the	expression	one	should	be	familiar	with	the
precedence	of	operators.

* *,	/,	%	have	higher	precedence	than	+,	-.

* To	change	the	precedence	of	operators	()	are	used.

* The	mechanism	of	converting	data	type	internally	by	the	compiler	is
known	as	“COERCION”.

* Data	types	of	expression:
  - The	addition,	subtraction,	multiplication	or	division between	the	byte,	short	and	int	results	as	int	as	they belong integer	type	of	data.
  - Byte	and	short	are	provided	by	java	for	backward compatibility.
  - If	float	is	used	in	the	expression	then	the	result	is	float.
  - If	Double	is	used	in	the	expression	then	the	result	is	double.
  - When	char	is	used	the	result	is	int	type	as	char	is	part	of int(codes).

### The arithmetic operators are + - * / %
- They can be performed on any type of data except boolean
-  *, / % these operators have the highest precedence than + -
- So, if in an expression these symbols are given then the ones
  with the highest priority will get executed first
- If you want to change the priority go any operator in an
  expression then we can use ( )
- The result of different datatype in is always integer
  - byte + byte
  - short + short
  - byte + short
  - int + int
  - short + int
- However, if a float is used in an expression then the result will be
  floated only even if an int value is present in the expression, this
  whole process is done by the compiler