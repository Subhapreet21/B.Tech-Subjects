
class Person implements Cloneable {

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    protected Person(Person personToCopy) {
        this.name = personToCopy.name;
        this.age = personToCopy.age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Person(this);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class DeepCopy {

    public static void main(String[] args) throws CloneNotSupportedException {
        // Create original person
        Person person1 = new Person("John Doe", 30);

        // Perform deep copy using clone()
        Person person2 = (Person) person1.clone();

        System.out.println("Original Person:");
        person1.displayInfo();
        System.out.println("\nCopied Person:");
        person2.displayInfo();

        // Modify original person
        person1.age = 31;

        System.out.println("\nAfter modifying the original person:");
        person1.displayInfo();
        System.out.println("\nCopied Person remains unchanged:");
        person2.displayInfo();
    }
}
