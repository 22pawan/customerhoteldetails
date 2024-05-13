import java.util.ArrayList;
import java.util.List;

public class StudentCourses {
    private List<Semester> semesters;

    public StudentCourses() {
        semesters = new ArrayList<>();
    }

    public void addCourse(String semesterName, String courseName, int marks) {
        Semester semester = findOrCreateSemester(semesterName);
        semester.addCourse(courseName, marks);
    }

    private Semester findOrCreateSemester(String semesterName) {
        return semesters.stream()
                .filter(semester -> semester.getName().equals(semesterName))
                .findFirst()
                .orElseGet(() -> {
                    Semester newSemester = new Semester(semesterName);
                    semesters.add(newSemester);
                    return newSemester;
                });
    }

    public void displayCourses() {
        semesters.forEach(Semester::displayCourses);
    }

    private static class Semester {
        private String name;
        private List<Course> courses;

        public Semester(String name) {
            this.name = name;
            courses = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addCourse(String courseName, int marks) {
            courses.add(new Course(courseName, marks));
        }

        public void displayCourses() {
            System.out.println("Semester: " + name);
            courses.forEach(course -> System.out.println("Course: " + course.getName() + ", Marks: " + course.getMarks()));
            System.out.println();
        }
    }

    private static class Course {
        private String name;
        private int marks;

        public Course(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public int getMarks() {
            return marks;
        }
    }
}
