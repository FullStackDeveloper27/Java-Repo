package Chapter_11_OOPS.Chapter_03_Inheritance;
/*
Library Compute Inheritance

A library issues books on rental basis at a 2% charge on the cost price of the book per day. As per the rules of the library, a book can be retained for 7 days without any fine. If the book is returned after 7 days, a fine will also be charged for the excess days as per the chart given below:

Number of excess days	Fine per day (Rs.)
1 to 5	                 2.00
6 to 10	                 3.00
Above 10	             5.00
A super class Library has been defined. Define a subclass Compute to calculate the fine and the total amount. The details of the members of both the classes are given below:

Class name: Library
Data members/instance variables:
name: to store the name of the book
author: to store the author of the book
p: to store the price of the book (in decimals)
Methods/Member functions:
Library(…): parameterized constructor to assign values to the data members
void show(): displays the book details

Class name: Compute
Data members/instance variables:
d: number of days taken in returning the book
f: to store the fine (in decimals)
Methods/Member functions:
Compute(…): parameterized constructor to assign values to the data members of both the classes
void fine(): calculates the fine for the excess days as given in the table above

void show(): displays the book details along with the number of days, fine and the total amount to be paid. Total amount is (2% of price of book * total no. of days) + fine

Assume that the super class Library has been defined. Using the concept of inheritance, specify the class Compute giving the details of the constructor, void fine() and void show() functions.

The super class, main() function and algorithm need not be written.
 */

import java.util.Scanner;

class Library{
    protected String name;
    protected String author;
    protected double p;
    public Library(String n, String a, double price){
        name = n;
        author = a;
        p = price;
    }
    public void show(){
        System.out.println("Book Title: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + p);
    }
}

class Compute extends Library{
    int d;
    double f;
    public Compute(String n, String a, double price, int days){
        super(n, a, price);
        d = days;
        f = 0.0;
    }
    public void fine(){
        int excess = d - 7;
        if(excess > 10)
            f = 5.0 * excess;
        else if(excess > 5)
            f = 3.0 * excess;
        else if(excess > 0)
            f = 2.0 * excess;
    }
    public void show(){
        super.show();
        System.out.println("No. of days: " + d);
        System.out.println("Fine: Rs. " + f);
        double amt = 0.02 * p * d + f;
        System.out.println("Total amount: Rs. " + amt);
    }
}
public class inheritance_05 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Title of the book: ");
        String n = in.nextLine();
        System.out.print("Author: ");
        String a = in.nextLine();
        System.out.print("Price: ");
        double price = Double.parseDouble(in.nextLine());
        System.out.print("No. of days taken to return the book: ");
        int days = Integer.parseInt(in.nextLine());
        Compute obj = new Compute(n, a, price, days);
        obj.fine();
        obj.show();
    }
}
