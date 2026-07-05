package Arrays;
import java.util.Scanner;
public class roll {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of an array");
          int n = sc.nextInt();
          int [] arr = new int[n];
          System.out.println("Enter the roll numbers");
          for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
          }
          //output
          System.out.println("The passed roll numbers are");
          for(int i=0;i<n;i++){
            if(arr[i]<35){
                System.out.println(i + " "); // i print krne s index print ho gya 
                // aur isko kehte hai traversing of an array
             
            }
        //        System.out.print("index of failed are" + " ");
        //         System.out.print(i + " ");
          }
            }
}
