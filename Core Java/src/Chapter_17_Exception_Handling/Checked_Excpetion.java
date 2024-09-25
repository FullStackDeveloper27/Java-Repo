package Chapter_17_Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

class Checked{
    public boolean UserDoc(String FilePath) throws FileNotFoundException {
        FileReader fr = new FileReader("");
        return false;
    }
}

public class Checked_Excpetion {
    public static void main(String[] args) throws FileNotFoundException {
        Checked c = new Checked();
        System.out.println(c.UserDoc("/content/cv"));
    }
}

//class Checked{
//    public boolean UserDoc(String FilePath) throws FileNotFoundException {
//        FileReader fr = new FileReader("");
//        return false;
//    }
//}
//
//public class Checked_Excpetion {
//    public static void main(String[] args) throws FileNotFoundException {
//        Checked c = new Checked();
//        System.out.println(c.UserDoc("/content/cv"));
//    }
//}
