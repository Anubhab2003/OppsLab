import java.util.*;

class Student {
    Scanner s = new Scanner(System.in);
    int rollno;
    String name;

    void get() {
        System.out.print("Enter roll number: ");
        rollno = s.nextInt();
        
        s.nextLine();
        System.out.print("Enter name: ");
        name = s.nextLine();
    }

    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("Before input:");
        System.out.println("s1 rollno: " + s1.rollno);
        System.out.println("s2 rollno: " + s2.rollno);
        System.out.println("s3 rollno: " + s3.rollno);

        s1.get();
        s2.get();
        s3.get();

        System.out.println("After input:");
        System.out.println("s1 rollno: " + s1.rollno + ", name: " + s1.name);
        System.out.println("s2 rollno: " + s2.rollno + ", name: " + s2.name);
        System.out.println("s3 rollno: " + s3.rollno + ", name: " + s3.name);
    }
}
