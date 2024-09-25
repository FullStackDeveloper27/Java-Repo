package Chapter_11_OOPS.Chapter_05_Polymorphism;
//Java Runtime Polymorphism Example:
class Bank{
    float getRateOfInterest()
    {
        return 0;
    }
}
class SBI extends Bank{
    float getRateOfInterest(){
        return 8.4f;
    }
}
class ICICI extends Bank{
    float getRateOfInterest(){
        return 7.3f;
    }
}
class AXIS extends Bank{
    float getRateOfInterest(){
        return 9.7f;
    }
}
public class polymorphism_01 {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        b=new ICICI();
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
        b=new AXIS();
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
    }
}
