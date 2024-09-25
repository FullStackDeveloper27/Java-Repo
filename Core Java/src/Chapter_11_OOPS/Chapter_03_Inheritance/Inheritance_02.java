package Chapter_11_OOPS.Chapter_03_Inheritance;

import java.util.Scanner;
/*
A super class Bank has been defined to store the details of a customer. Define a sub-class Account that enables transactions for the customer with the bank. The details of both the classes are given below:

Class name: Bank
Data members/instance variables:
name: stores the name of the customer
accno: stores the account number
p: stores the principal amount in decimals
Member functions/methods:
Bank(…): parameterized constructor to assign values to the instance variables
void display(): displays the details of the customer

Class name: Account
Data member/instance variable:
amt: stores the transaction amount in decimals
Member functions/methods:
Account(…): parameterized constructor to assign values to the instance variables of both the classes
void deposit(): accepts the amount and updates the principal as p = p + amt
void withdraw(): accepts the amount and updates the principal as p = p – amt. If the withdrawal amount is more than the principal amount, then display the message “INSUFFICIENT BALANCE”. If the principal amount after withdrawal is less than 500, then a penalty is imposed by using the formula p = p – (500 – p) / 10
void display(): displays the details of the customer

Assume that the super class Bank has been defined. Using the concept of inheritance, specify the class Account giving details of the constructor, void deposit(), void withdraw() and void display().

The super class and the main function need not be written.
 */
class BankAccount{
    protected double accountNumber;
    protected String customerName;
    protected double PrincipleBalance;

    public BankAccount(double accountNumber, String customerName, double PrincipleBalance){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.PrincipleBalance = PrincipleBalance;
    }

    public void display(){
        System.out.println("Account Number "+ accountNumber);
        System.out.println("customerName  "+ customerName);
        System.out.println("PrincipleBalance " + PrincipleBalance);
    }
}
class SavingAccount extends BankAccount{
    protected double amount;
    public SavingAccount(double accountNumber, String customerName,double PrincipleBalance) {
        super(accountNumber, customerName,PrincipleBalance);
        amount = 0.0;
    }

    public void deposit(){
        Scanner in = new Scanner(System.in);
        System.out.print("Amount to be deposited: ");
        amount = Double.parseDouble(in.nextLine());
        PrincipleBalance = PrincipleBalance + amount;
    }

    public void withDraw(){
        Scanner in = new Scanner(System.in);
        System.out.print("Amount to be withdrawn: ");
        amount = Double.parseDouble(in.nextLine());
        if(amount>PrincipleBalance){
            System.out.println("INSUFFICIENT BALANCE");
        }else{
            PrincipleBalance = PrincipleBalance-amount;
            if(PrincipleBalance<500){
                PrincipleBalance = PrincipleBalance -(500-PrincipleBalance)/100;
            }
        }
    }

    public void display(){
        super.display();
        System.out.println("Transaction Amount: " + amount);
    }

}

public class Inheritance_02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        double accountNumber = Double.parseDouble(in.nextLine());
        System.out.print("Enter Name: ");
        String customerName = in.nextLine();
        System.out.print("Enter PrincipleBalance: ");
        double PrincipleBalance = Double.parseDouble(in.nextLine());

        SavingAccount sa = new SavingAccount(accountNumber,customerName,PrincipleBalance);
        while (true){
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Details");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(in.nextLine());
            switch(choice){
                case 1:
                    sa.deposit();
                    break;
                case 2:
                    sa.withDraw();
                    break;
                case 3:
                    sa.display();
                    break;
                default:
                    System.out.println("Bye!");
                    return;
            }
        }
    }
}
