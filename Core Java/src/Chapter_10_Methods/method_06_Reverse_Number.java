package Chapter_10_Methods;

public class method_06_Reverse_Number {
    static int reverse(int n){
        int rev = 0;
        while(n!=0){
            rev = rev*10+n%10;
            System.out.println(rev);
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(234));
    }
}
