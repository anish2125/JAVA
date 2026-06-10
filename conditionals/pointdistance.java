package Loops;
// import java.util.Scanner;

public class pointdistance{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the coordinates of the first point (x1, y1):");
        // int x1= sc.nextInt();
        // int y1 = sc.nextInt();
        // System.out.println("Enter the coordinates of second point (x2, y2):");
        // int x2 = sc.nextInt();
        // int y2 = sc.nextInt();  
        // System.out.println("Enter the coordinates of third point (x3, y3):");
        // int x3 = sc.nextInt();          
        // int y3 = sc.nextInt();
        int x1=1 , x2=4, y1=2, y2=6, x3=7, y3=8;

        double d1= Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        double d2= Math.sqrt(Math.pow(x3-x2,2) +  Math.pow(y3-y2,2));

        System.out.println("Distance between point 1 and point 2: " + d1);
        System.out.println("Distance between point 2 and point 3: " + d2);

        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y1)/(x3-x1);
        System.out.println("Slope of line between point 1 and point 2:" + m1);
        System.out.println("Slope of line between point 1 and point 3:" + m2);

        if(m1==m2){
            System.out.println("The points are colinear");
        }
        else{
            System.out.println("The points are not colinear");
        }
        // sc.close();
    }
}