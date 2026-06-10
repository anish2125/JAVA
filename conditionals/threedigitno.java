package conditionals;
import java.util.Scanner;
public class threedigitno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n>=100 &&n<1000){
            System.out.println("The number is a three digit number");
        }
        else{
            System.out.println("The number is not a three digit number");   
        }
    }
}
