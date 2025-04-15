import java.util.Scanner;
class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

class SchoolTest {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Student's Information");
        System.out.print("Student's Name: ");
        String studentName = scan.nextLine();
        System.out.print("Student's ID: ");
        int studentId = scan.nextInt();
        scan.nextLine();
        System.out.print( "Student's Grade Level: ");
        String studentGradeLevel = scan.nextLine();

        System.out.println("\nEnter Teacher's Information");
        System.out.print("Teacher's Name: ");
        String teacherName = scan.nextLine();
        System.out.print("Teacher's ID: ");
        int teacherId = scan.nextInt();
        scan.nextLine();
        System.out.print("Teacher's Subject: ");
        String teacherSubject = scan.nextLine();

        System.out.println("\nEnter Staff's Information");
        System.out.print("Staff's Name: ");
        String staffName = scan.nextLine();
        System.out.print("Staff's ID: ");
        int staffId = scan.nextInt();
        scan.nextLine();
        System.out.print("Staff's Department: ");
        String staffDepartment = scan.nextLine();

        Student student = new Student(studentName, studentId, studentGradeLevel);
        Teacher teacher = new Teacher(teacherName, teacherId, teacherSubject);
        Staff staff = new Staff(staffName, staffId, staffDepartment);

        System.out.println("\nStudent's Information: ");
        student.displayInfo();
        System.out.println();

        System.out.println("\nTeacher's Information:");
        teacher.displayInfo();
        System.out.println();

        System.out.println("\nStaff's Information:");
        staff.displayInfo();
        System.out.println();

        scan.close();
    }

}
}


