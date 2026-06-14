package patterns;
import java.util.Scanner;
public class nosqare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){ // rows
            for(int j=1;j<=n;j++){
               System.out.print(j + " "); // cols
            }
            System.out.println();
        }
    }
    
}
/*
1 2 3 4
1 2 3 4
1 2 3 4
 */