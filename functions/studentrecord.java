package functions;

public class studentrecord {
    public static void main(String[] args) {
        student("Anish",5,'A', 17);     
        student("Deepak", 1, 'B', 10);  
    }
    public static void student(String name , int classNum, char grade, int age ){
        System.out.println("The name of students is " + name+ " class is "+ classNum + " Grade is " + grade + " age is " + age );
    }
}
 