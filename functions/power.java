package functions;
import java.util.Scanner;
public class power {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        // int pow =1;
        // for(int i=1;i<=b;i++){
        //     pow = pow*a;
        // }
        System.out.println(Math.pow(a,b));
        System.out.println(Math.sqrt((16)));
        
    }
}
