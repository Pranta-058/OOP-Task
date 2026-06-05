package Discussion10;
class Student {
    private int id;
    private String name;
    private String program;

    public Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
    }
}

class Instructor {
    private int id;
    private String name;
    private String department;
    private String title;

    public Instructor(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }

    public void display() {
        System.out.println("Instructor ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Title: " + title);
    }
}

class Course {
    private int id;
    private String syllabus;
    private String title;
    private int credits;
    private String prerequisite;

    public Course(int id, String syllabus, String title,
                  int credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    public void display() {
        System.out.println("Course ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Credits: " + credits);
        System.out.println("Prerequisite: " + prerequisite);
    }
}

class CourseOffering {
    private Student student;
    private Instructor instructor;
    private Course course;

    private String time;
    private int sectionNo;
    private int roomId;
    private int year;
    private String semester;

    public CourseOffering(Student student,
                          Instructor instructor,
                          Course course,
                          String time,
                          int sectionNo,
                          int roomId,
                          int year,
                          String semester) {

        this.student = student;
        this.instructor = instructor;
        this.course = course;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }

    public void display() {
        System.out.println("\n===== Course Offering =====");

        student.display();
        System.out.println();

        instructor.display();
        System.out.println();

        course.display();
        System.out.println();

        System.out.println("Time: " + time);
        System.out.println("Section No: " + sectionNo);
        System.out.println("Room ID: " + roomId);
        System.out.println("Year: " + year);
        System.out.println("Semester: " + semester);
    }
}
public class studentCourse {
    public static void main(String[] args) {

        Student s1 = new Student(
                101,
                "Pranta",
                "CSE");

        Instructor i1 = new Instructor(
                201,
                "Rahman",
                "CSE",
                "Professor");

        Course c1 = new Course(
                301,
                "OOP Syllabus",
                "Object Oriented Programming",
                3,
                "Programming Fundamentals");

        CourseOffering offer = new CourseOffering(
                s1,
                i1,
                c1,
                "10:00 AM",
                1,
                505,
                2025,
                "2/1");

        offer.display();
    }
}
