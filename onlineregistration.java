package program4;
class Course {
    String name;
    int marks;
    int id;
    Course(String name, int marks,int id) {
        this.name = name;
        this.marks = marks;
        this.id=id;
    }
}
class Student {
    String name = "Ravi";
    String program = "msc";
    int semester = 5;
    Course[] courses = {
        new Course("Math", 35,01),
        new Course("Java", 75,02),
        new Course("English", 30,03),
        new Course("Kannada", 30,03),
    };
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses Registered:");
        for (Course c : courses) {
            System.out.println("  - " + c.name);
        }
    }
    void displayLowMarks() {
        System.out.println("\nCourses with marks < 40:");
        for (Course c : courses) {
            if (c.marks < 40) {
                System.out.println("  " + c.name + ": " + c.marks);
            }
        }
    }
}
public class onlineregistration {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayInfo();
        s.displayLowMarks();
    }
}
