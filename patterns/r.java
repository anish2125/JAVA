package patterns;
import java.util.Scanner;
public class r {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of n");
         int n =sc.nextInt();
         int nsp=n-1, nst=n;
         for(int i =1;i<=n;i++){ //lines
            for(int j=1;j<=nsp;j++){ //spaces
                System.out.print(" "  + " ");
            }
            for(int j =1;j<=nst;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
            nsp--;
            // nst +=1;

         }
    }
}
