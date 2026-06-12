package loops;
import java.util.Scanner;
public class reverseloopuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which to reverse");
        int n = sc.nextInt();
        int r =0;
        while(n!=0){
            int ld = n%10;
            r = r*10;
            r = r+ld;
            n = n/10;
        }
        System.out.println(r);
    }
}
