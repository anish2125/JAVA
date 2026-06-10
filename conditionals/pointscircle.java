package conditionals;
import java.util.Scanner;

public class pointscircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of the center of the circle (h, k):");
        int h = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("Enter the radius of the circle:");
        int r = sc.nextInt();
        System.out.println("Enter the coordinates of the point (x, y):");
        int x = sc.nextInt();
        int y = sc.nextInt();
        double distance = Math.sqrt(Math.pow(x-h,2) + Math.pow(y-k,2));
        if(distance < r){
            System.out.println("The point is inside the circle");
        } else if(distance == r){
            System.out.println("The point is on the circle");
        } else {
            System.out.println("The point is outside the circle");  
        }} 
    
}
