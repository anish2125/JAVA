package user_input;
import java.util.Scanner;

public class reeminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend:");
        int a = sc.nextInt();
        System.out.println("Enter divisor:");
        int b = sc.nextInt();
        int q = a/b; // quotient
        int r = a-b*q; // remainder
        System.out.println("The quotient is: " + q);
        System.out.println("The remainder is: " + r);
    }


    }
