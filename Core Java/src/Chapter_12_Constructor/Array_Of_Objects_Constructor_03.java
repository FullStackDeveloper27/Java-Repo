package Chapter_12_Constructor;

// Properties and Constructor
// two class
// 1. Student --> rollno,name, dept,subjects (Proprties)
// 2. Subject --> subID,name,maxMarks,marksObtain

class Subject{
    // Properties
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    // creating constructor with some parameter
    public Subject(String subID,String name,int maxMarks){
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    // Creating methods to access hide data like private
    // get methods
    public String getSubID(){
        return subID;
    }
    public String getName(){
        return name;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int getMarksObtain(){
        return getMarksObtain();
    }

    // set methods

    public void setMaxMarks(int num){
        maxMarks = num;
    }

    public void setMarksObtain(int m){
        marksObtain = m;
    }

    boolean isQualified(byte m){
        return marksObtain>=maxMarks/10*4;
    }
    public String toString(){
        return "\nsubID :"+subID+"\nname "+name+"\nmarks obtained "+marksObtain;
    }


}
public class Array_Of_Objects_Constructor_03 {

    public static void main(String[] args) {
        // creating array object
        Subject s[] = new Subject[3];
        s[0] = new Subject("s101","DS",100);
        s[1] = new Subject("s102","DSA",100);
        s[2] = new Subject("s103","Java",100);

        for(Subject ss:s){
            System.out.println(ss);
        }
    }
}
