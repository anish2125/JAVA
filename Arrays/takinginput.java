package Arrays;

import java.util.Scanner;

public class takinginput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt(); // it defines the size of an array n name ke variable me sc.nextInt() the size
        int[] arr = new int[n]; // it defines the array of size n

        System.out.println("Enter the elements of an array");
        // input of an array
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt(); // it takes the input of an array

        }
        // output of an array\

        System.out.println("The elements of an array are ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }     
    }
}
