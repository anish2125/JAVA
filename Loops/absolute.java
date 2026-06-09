package Loops;
import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The number is" + n);
        if(n<0){
            n= n* (-1);
        }
        System.out.println("The absolute value is" + n);
    }
}
