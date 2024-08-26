package Chapter_07_Strings_Class_Printing;

public class String_Methods {
    public static void main(String[] args) {
        String str = "Java Program";
        String str1 = "    Java     ";
        System.out.println(str.length());
        System.out.println(str.toLowerCase()); // will return new string or new object in heap not in string pool.
        System.out.println(str.toUpperCase());
        System.out.println(str); // original value will not change
        System.out.println(str1.trim()); // it will remove the empty space before and after string. this will create new object in heap.
        System.out.println(str1);

        System.out.println(str.substring(3)); // will take staring index and ending index.
        System.out.println(str.trim().substring(3,7));

        System.out.println(str.replace("J","j"));
        System.out.println(str);

        System.out.println(str.startsWith("Java"));
        System.out.println(str.endsWith("Program"));

        System.out.println(str.charAt(3));
        System.out.println(str.indexOf('P')); // if not found -1
        System.out.println(str.lastIndexOf('m'));

        String str3 = "Java Program";
        String str4 = "Java Program";
        String str6 = "java Program";
        String str5 = new String("Java Program");
        System.out.println(str3.equals(str4)); // it will check the content in string pool
        System.out.println(str3==str4);  // this will check the reference of the object.

        System.out.println(str3.equals(str5)); // checking for content true
        System.out.println(str3==str5);  // false reference is different

        System.out.println(str3.equalsIgnoreCase(str6));

        System.out.println(str3.compareTo(str6)); // this will compare the letter return 1 o -1
        System.out.println(str3.contains("Program"));

        System.out.println(str3.concat(str4)); // concatenation
        System.out.println(str3 + str4);


    }
}
