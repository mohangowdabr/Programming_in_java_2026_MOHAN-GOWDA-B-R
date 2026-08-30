import java.util.Scanner;

// Super class
class Student {
    int studentId;
    String studentName;
    String department;

    Student(int studentId, String studentName, String department) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
    }

    void displayStudentDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Department   : " + department);
    }
}

// Sub class 1
class UndergraduateStudent extends Student {
    int semester;
    double cgpa;

    UndergraduateStudent(int studentId, String studentName, String department, int semester, double cgpa) {
        super(studentId, studentName, department);
        this.semester = semester;
        this.cgpa = cgpa;
    }

    void displayUGDetails() {
        System.out.println("Semester     : " + semester);
        System.out.println("CGPA         : " + cgpa);
    }
}

// Sub class 2
class PostgraduateStudent extends Student {
    String specialization;
    String researchTopic;

    PostgraduateStudent(int studentId, String studentName, String department, String specialization, String researchTopic) {
        super(studentId, studentName, department);
        this.specialization = specialization;
        this.researchTopic = researchTopic;
    }

    void displayPGDetails() {
        System.out.println("Specialization : " + specialization);
        System.out.println("Research Topic : " + researchTopic);
    }
}

// Main class
public class StudentInheritanceSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---- Undergraduate Student ----
        System.out.println("Enter Undergraduate Student details:");
        System.out.print("Student ID: ");
        int ugId = sc.nextInt();
        sc.nextLine();
        System.out.print("Student Name: ");
        String ugName = sc.nextLine();
        System.out.print("Department: ");
        String ugDept = sc.nextLine();
        System.out.print("Semester: ");
        int semester = sc.nextInt();
        System.out.print("CGPA: ");
        double cgpa = sc.nextDouble();

        UndergraduateStudent ug = new UndergraduateStudent(ugId, ugName, ugDept, semester, cgpa);

        System.out.println("\n--- Undergraduate Student Details ---");
        ug.displayStudentDetails();
        ug.displayUGDetails();

        sc.nextLine(); // clear buffer

        // ---- Postgraduate Student ----
        System.out.println("\nEnter Postgraduate Student details:");
        System.out.print("Student ID: ");
        int pgId = sc.nextInt();
        sc.nextLine();
        System.out.print("Student Name: ");
        String pgName = sc.nextLine();
        System.out.print("Department: ");
        String pgDept = sc.nextLine();
        System.out.print("Specialization: ");
        String specialization = sc.nextLine();
        System.out.print("Research Topic: ");
        String researchTopic = sc.nextLine();

        PostgraduateStudent pg = new PostgraduateStudent(pgId, pgName, pgDept, specialization, researchTopic);

        System.out.println("\n--- Postgraduate Student Details ---");
        pg.displayStudentDetails();
        pg.displayPGDetails();

        sc.close();
    }
}
