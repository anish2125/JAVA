package Arrays;

import java.util.Scanner;

public class taking_inp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt(); // it is actually defines the size of an array
        int[] arr = new int[n];

        // input
        System.out.println("Enter the elements of an array");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt(); // takes the input of an array
        }
        //out
        System.out.println("The elements of an array are");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
