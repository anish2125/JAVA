package Loops;
import java.util.Scanner;

public class percemtage {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtaied subject 1");
        int s1 = sc.nextInt();
        System.out.println("Enter the marks obtained in subject 2");
        int s2 = sc.nextInt();
        System.out.println("Enter the marks obtained in subject 3");
        int s3 = sc.nextInt();
        System.out.println("Enter the marks obtained in subject 4");
        int s4 = sc.nextInt();  
        System.out.println("Enter the marks obtained in subject 5");
        int s5 = sc.nextInt();
        int total= s1+s2+s3+s4+s5;
        float per = (total/500.0f)*100;
        System.out.println("The performance in class is " + per);   

        if(per>90){
            System.out.println("Exnellent");
        }
        else if(per>80){
            System.out.println("Very good");
        }
        else if(per>70){
            System.out.println("Good");
        }
        else if(per>60){
            System.out.println("Average");
        }
        else if(per>50){
            System.out.println("Below average");
        }
        else{
            System.out.println("Poor");
        }

    }
    
}
