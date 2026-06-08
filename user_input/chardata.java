package user_input;
import java.util.Scanner;
public class chardata {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = '{';

        System.out.println("The char is" + ch);
        
        //      A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        //    0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
        // @ $ $%&*()_+|~`-=\{}[]:";'<>?,./
        // System.out.println("Enter a char:");
        // char input = sc.next().charAt(0);       
        // System.out.println("The char you entered is: " + input);
        int x = (int) ch;
        System.out.println("The ASCII value of the char is: " + x);

    }
}
