
import java.time.*;
import java.util.*;

// Define a class for Student with properties (name, date of birth)
class Student implements Comparable<Student> {

    private String name;
    private LocalDate dob;

    public Student(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    // Override compareTo method to define the sorting order
    @Override
    public int compareTo(Student otherStudent) {
        return this.dob.compareTo(otherStudent.dob);
    }

    // toString method for printing Student objects
    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ", dob=" + dob
                + '}';
    }
}

public class CompareObjects {

    // Method to add elements to the collection
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Create and add Student objects
        students.add(new Student("John Doe", LocalDate.of(1990, 1, 15)));
        students.add(new Student("Jane Smith", LocalDate.of(1995, 6, 20)));
        students.add(new Student("Michael Brown", LocalDate.of(1980, 3, 10)));
        students.add(new Student("Emily Taylor", LocalDate.of(1992, 9, 25)));

        System.out.println("Unsorted List:");
        printCollection(students);

        // Sort the collection
        Collections.sort(students);

        System.out.println("\nSorted List:");
        printCollection(students);
    }

    // Method to print a collection of objects
    public static void printCollection(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
