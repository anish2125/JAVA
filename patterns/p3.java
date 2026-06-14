package patterns;
import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter the no of orws and columns:");
                int m  = sc.nextInt();
                int n = sc.nextInt();
                for (int i =1;i<=m;i++){
                    for(int j =1;j<=n;j++){
                        System.out.println("*");
                    }
                    System.out.println();
                }
    }
    
}
