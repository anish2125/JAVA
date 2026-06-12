package loops;
import java.util.Scanner;
public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0; // yaha count ko pehle 0 intialize krenge aur phirdheere dheere bdhate rhenge
        if(n==0)
            count++;
        while(n!=0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
