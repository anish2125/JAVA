package functions;
import java.util.Scanner;
public class CFun {
    public static int fact(int x){
        int xfact =1;
        for(int i=1;i<=x;i++)
            xfact*=i;
        return xfact; // iska mtlb ki main funcion me retun jao and sbki value print kara lo
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nfact = fact(n);
        int rfact = fact(r);
        int n_rfact = fact(n-r);

        int ncr = nfact/(rfact*n_rfact);
        System.out.println(ncr);
    }
    
}
