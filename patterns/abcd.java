package patterns;
import java.util.Scanner;
public class abcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i =65;i<=n;i++){
            for(int j =65;j<=n;j++){
                System.out.print((char)i + " ");
            }
            System.out.println();
        }
    }
    
}
/* A A A A A 
   B B B B B
   C C C C C
   D D D D D
   E E E E E
 */