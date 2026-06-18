package functions;

public class Returntype {
    public static int sum(int a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,1));
    }
}
/*
main()  ---> "2 + 1 karo"
               ↓
            sum()
               ↓
          answer = 3
               ↓
main() ko return
               ↓
print 3
 */