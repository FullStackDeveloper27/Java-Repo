package Chapter_23_Collection_FrameWork.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
class Age implements java.util.Comparator{
    public int compare(Object o1,Object o2){
        Student	 s1=(Student)o1;
        Student	 s2=(Student)o2;
        if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}
public class ComparatorAge {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<Student>();
        list.add(new	Student(101,"Vijay",23));
        list.add(new	Student(106,"Ajay",27));
        list.add(new	Student(105,"Jai",21));
        list.add(new	Student(103,	"Amar",	13));
        System.out.println("Sort	by	age");
        Collections.sort(list,new Age());
        System.out.println("After	Sort	:	");
        for(Student st :	list) {
            System.out.println(st.rollno + "," + st.name + ", " + st.age);
        }
    }
}
