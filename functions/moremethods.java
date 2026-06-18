package functions;

public class moremethods {
     public static void fun(){
        next();
        System.out.println("hello i am Anish");
        for(int i =1;i<=10;i++){

            System.out.print(i + " ");
        }
        System.out.println();
        third();
        forth();
    }
    public static void main(String[] args) {
        System.out.println("yes");
        fun(); // function calling 
        System.out.println("Gian");
        next();
        third();
        forth();
    }
    public static void next(){
        System.out.println("Good morning");
    }
    public static void third(){
        System.out.println("how are you");
    }
    public static void forth(){
        System.out.println(Math.max(5,7));
    }
   
}
 