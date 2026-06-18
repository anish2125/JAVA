package functions;
import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fist num");
        double a =sc.nextDouble();
        System.out.println("Enter 2nd number");
        double b = sc.nextDouble();
        System.out.println("Enter third number");
        double c =sc.nextDouble();
        System.out.println("Enter 4th number");
        double d = sc.nextDouble();
        System.out.println("The max number is");
        System.out.println(Math.max(a,Math.max(b,c)));
        System.out.println("The minimum  number is");
        System.out.println(Math.min(a,Math.min(b,Math.min(c,d))));
    }
    
}
