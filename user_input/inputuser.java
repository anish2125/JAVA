package user_input;
import java.util.Scanner;

public class inputuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
         // Scanner class ka object banaya hai jiska naam sc hai aur usko System.in se initialize kiya hai
        System.out.println("Enter the radius of the circle: ");
        int radius= sc.nextInt();  // iska mtlb apne scanner se input le liya hai aur usko radius variable me store kar diya hai
        //Scanner sc = new Scanner(System.in)
        // int radius =sc.nextInt();
        double area = 3.14*radius*radius; // area ka formula hai pi*r*r
        System.out.println("The area of the circle is: " +area); // area ko print karne ke liye println ka use kiya hai

    
    }
    
}
