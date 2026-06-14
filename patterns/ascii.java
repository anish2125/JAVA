package patterns;
import java.util.Scanner;
public class ascii {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1;i<=n;i++){
            for(int j=65;j<=n;j++){
                System.out.print((char)j + " ");
            }
            System.out.println();
        }
    }
    
}
