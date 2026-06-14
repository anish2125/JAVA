package patterns;
import java.util.Scanner;
public class nstnspinvers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int nsp=0,nst=n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=nsp;j++){
                System.out.print(" " + " ");
            }
               for(int j=0;j<=nst;j++){
                System.out.print("* " + " ");
            }
        System.out.println();
        nsp ++ ;
        nst --;
            

        }
    }
}
