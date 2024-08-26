package Chapter_10_Methods;

public class method_05_Overload_Problem {
    //overloaded method to calculate areas
    static double area(double radius){
        return Math.PI*radius*radius;
    }
    static double area(double length,double breath){
        return length*breath;
    }

    public static void main(String[] args) {
        System.out.println(area(2));
        System.out.println(area(2,4));
    }
}
