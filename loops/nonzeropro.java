package loops;
import java.util.Scanner;
public class nonzeropro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pro =1;
        while(n>0){
            int ld= n%10;
            if(ld!=0){
                pro=pro*ld;
            }
            n=n/10;
        }
        System.out.println(pro);
    }
    
}
