package Chapter_11_OOPS.Chapter_03_Inheritance;
/*
Item Taxable Inheritance Java

A super class Item has been defined to store the details of an item sold by a wholesaler to a retailer. Define a subclass Taxable to compute the total amount paid by the retailer along with service tax.
Some of the members of both the classes are given below:

Class name: Item
Data members/instance variables:
name: to store the name of the item
code: integer to store the item code
amount: stores the total sale amount of the item (in decimals)
Member functions/methods:
Item(…): parameterized constructor to assign value to the data members
void show(): to display the item details

Class name: Taxable
Data members/instance variables:
tax: to store the service tax (in decimals)
totamt: to store the total amount (in decimals)
Member functions/methods:
Taxable(…): parameterized constructor to assign values to the data members of both classes

void cal_tax(): calculates the service tax @ 10.2% of the total sale amount, and calculates the total amount paid by the retailer as (total sale amount + service tax)
void show(): to display the item details along with the total amount

Assume that the super class Item has been defined. Using the concept of inheritance, specify the class Taxable, giving details of the constructor, void cal_tax() and void show().

The super class, main() function and algorithm need not be written.
 */

import java.util.Scanner;

class Item{
    protected String name;
    protected int code;
    protected double amount;
    public Item(String n, int c, double a){
        name = n;
        code = c;
        amount = a;
    }
    public void show(){
        System.out.println("Item name: " + name);
        System.out.println("Item code: " + code);
        System.out.println("Item sale amount: " + amount);
    }
}
class Taxable extends Item{
    double tax;
    double totamt;
    public Taxable(String n, int c, double a){
        super(n, c, a);
        tax = 0.0;
        totamt = 0.0;
    }
    public void cal_tax(){
        tax = 10.2 / 100 * amount;
        totamt = amount + tax;
    }
    public void show(){
        super.show();
        System.out.println("Service tax: " + tax);
        System.out.println("Total amount: " + totamt);
    }
}
public class inheritance_04 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("ITEM NAME: ");
        String n = in.nextLine();
        System.out.print("ITEM CODE: ");
        int c = Integer.parseInt(in.nextLine());
        System.out.print("ITEM SALE AMOUNT: ");
        double a = Double.parseDouble(in.nextLine());
        Taxable obj = new Taxable(n, c, a);
        obj.cal_tax();
        obj.show();
    }
}
