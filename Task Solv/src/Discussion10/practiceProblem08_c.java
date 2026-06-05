package Discussion10;
class Student1 {
    private String name;
    private double[][] gradePoints;
    private double[] credits;

    public Student1(String name, double[][] gradePoints, double[] credits) {
        this.name = name;
        this.gradePoints = gradePoints;
        this.credits = credits;
    }

    public double calculateCGPA(int studentIndex) {
        double totalPoints = 0;
        double totalCredits = 0;

        for (int i = 0; i < credits.length; i++) {
            totalPoints += gradePoints[studentIndex][i] * credits[i];
            totalCredits += credits[i];
        }

        return totalPoints / totalCredits;
    }

    public String getName() {
        return name;
    }
}

public class practiceProblem08_c {
    public static void main(String[] args) {

        double[] credits = {3, 3, 2, 3, 1};

        double[][] grades = {
                {4.00, 3.75, 3.50, 4.00, 3.75},
                {3.50, 3.25, 3.75, 3.50, 4.00},
                {4.00, 4.00, 3.75, 3.50, 3.75},
                {3.25, 3.50, 3.00, 3.75, 3.50},
                {3.75, 4.00, 3.50, 4.00, 4.00}
        };

        Student1[] students = {
                new Student1("Rahim", grades, credits),
                new Student1("Karim", grades, credits),
                new Student1("Sakib", grades, credits),
                new Student1("Tamim", grades, credits),
                new Student1("Nabil", grades, credits)
        };

        System.out.println("CGPA of Students");
        System.out.println("----------------");

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%s : %.2f\n",
                    students[i].getName(),
                    students[i].calculateCGPA(i));
        }
    }
}
