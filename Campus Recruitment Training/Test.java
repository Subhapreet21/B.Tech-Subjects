
class Student {

    int rollno;               // Instatnce variables
    String name;
    String address;

    Student() {                             // Default Constructor
        this.address = "MRUH";
    }

    Student(int r, String n) {       // Parameterized Constructor (2 argument)
        this();        		   // refers the default constructor 
        this.rollno = r;
        this.name = n;
    }

    Student(int r, String n, String a) {      // Parameterized Constructor   (3 argument)
        this.rollno = r;
        this.name = n;
        this.address = a;
    }

    void addStudentRecord(int r, String n, String a) {        // Instance method
        rollno = r;
        name = n;
        address = a;
    }

    void displayDetails() // Instance method
    {
        System.out.println(rollno + " " + name + " " + address);
    }
}

public class Test {

    public static void main(String args[]) {
        Student s1 = new Student(101, "Akhil", "HYD");
        Student s2 = new Student(102, "Bindhu");
        Student s3 = new Student();
        s3.addStudentRecord(103, "Chanran", "SEC");
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
