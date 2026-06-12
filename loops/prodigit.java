package loops;
import java.util.Scanner;
public class prodigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit of which you want the product");
        int n = sc.nextInt();
        int pro=1;
        int lastdigit = 0;
        while (n!=0) {
            lastdigit =n%10;
            pro = pro*lastdigit;
            n=n/10;
            
        }
        System.out.println(pro);
    }

    
}
