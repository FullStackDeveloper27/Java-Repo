package Chapter_23_Collection_FrameWork.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Employee{
    int id;
    String name;
    double Salary;
    Employee(int id, String name,double Salary){
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }
}

public class List_Parameterized_Constructor {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<Employee>();
        Employee ep1 = new Employee(123,"Naveen",12000);
        Employee ep2 = new Employee(234,"Ravi",42000);
        Employee ep3 = new Employee(345,"Santu",32000);

        emp.add(ep1);
        emp.add(ep2);
        emp.add(ep3);

        System.out.println(emp);

        for (Employee e:emp){
            System.out.println(e.id+" , "+ e.Salary+ " , "+e.name);
        }

        //Display Employees List in reverse order:
        System.out.println("Details	are	:	");
        for(int i=emp.size()-1 ; i>=0 ; i--)
        {
            Employee e = emp.get(i);
            System.out.println(e.id + "	, "	+ e.name + "	, "	+ e.Salary);
        }

        //Display using Iterator:
        System.out.println("Details	are	:	");
        Iterator<Employee> itr	=	emp.iterator();
        while(itr.hasNext())
        {
            Employee e =	itr.next();
            System.out.println(e.id + "	, "	+ e.name + "	, "	+ e.Salary);
        }

        //Display using ListIterator:
        System.out.println("Details	are	:	");
        ListIterator<Employee> listItr	=	emp.listIterator();
        while(listItr.hasPrevious())
        {
            Employee e =	listItr.previous();
            System.out.println(e.id + "	, "	+ e.name + "	, "	+ e.Salary);
        }
    }
}
