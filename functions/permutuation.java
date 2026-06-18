package functions;
import java.util.Scanner;
public class permutuation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        int nfact=1;
        for(int i=1;i<=n;i++){
            nfact *=i;
        }
        int n_rfact=1;
        for(int i =1;i<=n-r;i++){
            n_rfact *=i;
        }
        int npr = (nfact)/(n_rfact);
        System.out.println(npr);
    }
}
