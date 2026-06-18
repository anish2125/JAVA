package functions;

public class returnteg {
    public static int sum(int a, int b){
        System.out.println("Hello Shubh Lala");
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(4,2));
    }
}
/*
main()
  |
  |--> sum(4,2)
           |
           |--> print "Hello Shubh Lala"
           |
           |--> return 6
  |
  |--> print 6

*/