package Arrays;
import java.util.Scanner;
public class doublee {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input
        System.out.println("Enter the elements of anb array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //output
        System.out.println("The elements of an array are");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]*2);
        }
    }
}
