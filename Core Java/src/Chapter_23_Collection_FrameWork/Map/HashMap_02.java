package Chapter_23_Collection_FrameWork.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Double> map = new HashMap<String,Double>();
        while (true){
            System.out.println("1.	Add	Book");
            System.out.println("2.	Update	Book");
            System.out.println("3.	Display	Book");
            System.out.println("4.	Remove	Book");
            System.out.println("5. Quit");
            System.out.print("Enter	your choice:	");
            int ch = sc.nextInt();
            if(ch==1){
                System.out.print("Enter	Book Name:	");
                String	name = sc.next();
                if(map.containsKey(name)){
                    System.out.println("Book already exists");
                }else{
                    System.out.println("Enter Price ");
                    Double price = sc.nextDouble();
                    map.put(name,price);
                    System.out.println("Book Added");
                }
            } else if (ch==2) {
                System.out.print("Enter Book Name: ");
                String name = sc.next();
                if(map.containsKey(name)){
                    System.out.println("Enter Price: ");
                    Double price = sc.nextDouble();
                    map.replace(name,price);
                    System.out.println("Book Updated");
                }else{
                    System.out.println("Error : Invalid Book Name");
                }
            } else if (ch==3) {
                System.out.print("Enter	Book	Name	:	");
                String	name	=	sc.next();
                if(map.containsKey(name))
                {
                    System.out.println("Price : " + map.get(name));
                }
                else{
                    System.out.println("Error : Invalid Book Name");
                }
            }else if(ch==4)
            {
                System.out.print("Enter	Book	Name	:	");
                String	name	=	sc.next();
                if(map.containsKey(name))
                {
                    map.remove(name);
                    System.out.println("Book removed");
                }
                else
                    System.out.println("Error : Invalid Book Name");
            }else if(ch==5)
            {
                System.out.println("End");
                System.exit(1);
            }
            else{
                System.out.println("Invalid choice");
            }
        }
    }
}
