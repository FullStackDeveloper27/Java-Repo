package Chapter_07_Strings_Class_Printing;

public class Strings {
    public static void main(String[] args) {
        String str1 = "Java Program"; // this will create in string pool
        String str13 = "Java Program"; // this will create in string pool
        System.out.println(str1);

        String str2 = new String("Java Program"); // this will create in string pool and heap memory.
        System.out.println(str2);

        System.out.println(str1 ==  str2); // false
        System.out.println(str1 ==  str13); // true

        char c[] ={'H','e','l','l','o'};
        String str3 = new String(c);
        System.out.println(str3);

        byte b[] = {65,66,67,68};
        String str4 = new String(b);
        System.out.println(str4);
    }
}
