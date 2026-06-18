package functions;

public class passingargs {
    public static void greet(String name){ //name vatiable is used as an arguments 
        System.out.println("Good morning " + name);
    }
public static void sum(int a , int b){
     System.out.println("Sum of the given number is:    "+(a +b));
    
}

 public static void main(String[] args) {
        greet("Anish");  // call
        greet("Modiji");
        sum(70,38);
        // yaha s bs function ko call krte hai baki sbka kaam alag alag fun me bana ke kr skte hai

       
    }
}
