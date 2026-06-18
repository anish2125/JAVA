package functions;

public class methods {
    static int i;
    public static void main(String[] args) {
        i=16;
        System.out.println(i);

        i =33;
        System.out.println(i);
        fun();
    }
    public static void fun()
    {
        System.out.println(i);
    }
}
