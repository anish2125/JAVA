package functions;
import java.util.Scanner;
public class combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        int nfact=1;
        for(int i =1;i<=n;i++){
            nfact *=i;
        }
        int rfact=1;
        for(int i =1;i<=r;i++){
            rfact *=i;
        }
        int nmr=1;
        for(int i =1;i<=n-r;i++){
            nmr *=i;
        }
        int ncer = nfact/(rfact*nmr);
        System.out.println(ncer);
      
    }
}
