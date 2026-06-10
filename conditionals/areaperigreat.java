package conditionals;
import java.util.Scanner;

public class areaperigreat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int l = sc.nextInt();
        System.out.println("Enter the breatdth");
        int b  = sc.nextInt();
        int area = l*b;
        int peri = 2*(l+b);
        System.out.println("The area is" + area);
        System.out.println("The perimeter is" + peri);
        if(area>peri){
            System.out.println("Area is greater than perimeter");
        }
        else if(peri>area){
            System.out.println("Perimeter is greater than area");
        }
        else{
            System.out.println("Area and perimeter are equal");
        }
    }
    
}
