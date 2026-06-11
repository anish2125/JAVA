package loops;
import java.util.Scanner;
public class apd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i=4; i<=3*n+1; i=i+3 )
        // System.out.print(i + " ");

        // int a =4,d=3;
        // for(int i =1;i<=n;i++)
        // {
        //     System.out.println(a + " ");
        //      a=a+d;
        // }
        // 3,7,11,15,19,23...
        int a  =3, d=4;
        for(int i =1;i<=n;i++){
                System.out.println( a + " "); // This method is perfect for finding AP
                a=a+d;
        }

       
    }
}
