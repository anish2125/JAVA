package loops;
import java.util.Scanner;;
public class prime {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            int n =sc.nextInt();
            for(int i =2;i<=n-1;i++){
                if (n%i==0){
                    System.out.print("Composite Number");
                    break;
                }
                    else
                    {
                        System.out.println("Prime no.");
                        break;
                    }
                }
            }
        
        }
    }
    
