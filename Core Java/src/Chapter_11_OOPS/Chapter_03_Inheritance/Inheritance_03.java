package Chapter_11_OOPS.Chapter_03_Inheritance;
/*
Product Sales Inheritance Java

A super class Product has been defined to store the details of a product sold by a wholesaler to a retailer. Define a subclass Sales to compute the total amount paid by the retailer with or without fine along with service tax.

Some members of both the classes are given below:

Class name: Product
Data member/instance variable:
name: stores the name of the product
code: integer to store the product code
amount: stores the total sale amount of the product (in decimals)
Member functions/methods:
Product(String n, int c, double p): parameterized constructor to assign data members name = n, code = c and amount = p
void show(): displays the details of the data members

Class name: Sales
Data member/instance variable:
day: stores number of days taken to pay the sale amount
tax: to store the service tax (in decimals)
totamt: to store the total amount (in decimals)
Member functions/methods:
Sales(…): parameterized constructor to assign values to data members of both the classes

void compute(): calculates the service tax @ 12.4% of the actual sale amount

calculates the fine @2.5% of the actual sale amount only if the amount paid by the retailer to the wholesaler exceeds 30 days
calculates the total amount paid by the retailer as (actual sale amount + service tax + fine)
void show(): displays the data members of super class and the total amount

Assume that the super class Product has been defined. Using the concept of inheritance, specify the class Sales giving the details of the constructor(…), void compute() and void show().

The super class, main() function and algorithm need not be written.
 */

import java.util.Scanner;

class Product{
    protected String name;
    protected int code;
    protected double amount;
    public Product(String name, int code, double amount){
        this.name = name;
        this.code = code;
        this.amount = amount;
    }
    public void show(){
        System.out.println("Product Name: " + name);
        System.out.println("Product Code: " + code);
        System.out.println("Total Sale Amount: " + amount);
    }
}
class Sales extends Product {
    int days;
    double tax;
    double totamt;
    public Sales(String name, int code, double amount, int days){
        super(name,code,amount);
        tax = 0.0;
        totamt = 0.0;
    }
    public void compute(){
        tax = 12.4 / 100 * amount;
        totamt = amount + tax;
        if(days > 30)
            totamt += 2.5 / 100 * amount;
    }
    public void show(){
        super.show();
        System.out.println("Total amount: " + totamt);
    }
}

public class Inheritance_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Product name: ");
        String name = in.nextLine();
        System.out.print("Product code: ");
        int code = Integer.parseInt(in.nextLine());
        System.out.print("Total sale amount: ");
        double amount = Double.parseDouble(in.nextLine());
        System.out.print("Days taken: ");
        int days = Integer.parseInt(in.nextLine());
        Sales obj = new Sales(name, code, amount, days);
        obj.compute();
        obj.show();
    }
}
