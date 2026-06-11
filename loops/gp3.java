package loops;
import java.util.Scanner;

public class gp3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms of GP");
        int n =sc.nextInt();
        System.out.println("Enter the first term:");
        int a = sc.nextInt();
        System.out.println("Enter your common ratio");
        int r = sc.nextInt();

        for(int i =1; i<=n;i++){
            System.out.print(a + " ");
            a=a*r;
        }
    }
}
