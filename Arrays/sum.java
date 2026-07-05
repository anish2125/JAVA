package Arrays;
import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //output
        System.out.println("The ssum of an array is");
        int sum =0;
        for(int i=0;i<n;i++){
            sum= sum+arr[i];
        }
        System.out.println(sum);
    }
    
}
