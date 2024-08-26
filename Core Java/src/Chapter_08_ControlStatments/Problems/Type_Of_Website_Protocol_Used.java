package Chapter_08_ControlStatments.Problems;

import java.util.Scanner;

public class Type_Of_Website_Protocol_Used {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Website");
        String WebSiteUrl = sc.nextLine();
        String Starting_Protocol = WebSiteUrl.substring(0,WebSiteUrl.indexOf(":"));
        if(Starting_Protocol.equals("http")){
            System.out.println("HyperText Transfer Protocol");
        } else if (Starting_Protocol.equals("ftp")) {
            System.out.println("File Transfer Protocol");
        }else{
            System.out.println("HyperText Transfer Protocol Secure");
        }

        String Ending_Protocol = WebSiteUrl.substring(WebSiteUrl.lastIndexOf(".")+1);
        System.out.println(Ending_Protocol);
        if(Ending_Protocol.equals("com")){
            System.out.println("Commercial");
        } else if (Ending_Protocol.equals("org")) {
            System.out.println("Organisation");
        }else if (Ending_Protocol.equals("net")) {
            System.out.println("Network");
        } else {
            System.out.println("Other type website");
        }
    }
}
