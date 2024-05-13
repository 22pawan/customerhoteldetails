import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String name;
    private LocalDate dob;

    public Student(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public int calculateAge() {
        LocalDate today = LocalDate.now();
        return Period.between(dob, today).getYears();
    }

    public void displayInfo() {
        int age = calculateAge();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student student = new Student("John Doe", LocalDate.of(2000, 1, 1));
        student.displayInfo();
    }
}
