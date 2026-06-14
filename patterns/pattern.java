package patterns;
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");;
        int n =sc.nextInt();
        for(int i =1;i<=n;i++){

            //spaces
            for(int j =1;j<=n-i;j++)
            {
                System.out.println(" ");
            }
            // characters
            for(int k = 65; k <= 64 + i; k++) {
                 System.out.print((char)k + " ");
                }
            System.out.println();
        }
    }
}
