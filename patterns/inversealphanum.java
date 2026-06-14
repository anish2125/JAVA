package patterns;
import java.util.Scanner;
public class inversealphanum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();{
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n+1-i;j++){
                if(n%2==0){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print((char)(i+65) + " ");
                }
            }
                System.out.println();

        }
}

    }
}
