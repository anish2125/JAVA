package loops;
import java.util.Scanner;;
public class highestfactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int hf =1; //intialize highest factor 1 because the highest factor of anything is 1
        for(int i =1; i<=n;i++){
            if(n%i==0)
                hf=i;
        }
        System.out.print(hf);
    }

}
