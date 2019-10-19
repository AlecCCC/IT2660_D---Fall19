import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
 
        int choice = 0;

        BinarySearch binarySearch = new BinarySearch();
        Node newStudent;
        while (choice != 6) {
           
            Scanner input = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);
            runMenu();
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Enter name");
                String studentName = input.nextLine();
                System.out.println("Enter student ID");
                int studentId = input.nextInt();
                System.out.println("Enter student G.P.A");
                double studentGpa = input.nextDouble();
                newStudent = new Node(studentId,studentName,studentGpa);
                binarySearch.addNode(newStudent);
            }
            if (choice == 2) {
                System.out.println("Enter the student ID number");
               int studentFind = input.nextInt();
               Node student = binarySearch.fetchStudent(studentFind);
                System.out.println("Student Name: " + student.name + "\nStudent ID: " + student.key + "\n" + "Student G.P.A.: " + student.gpa + "\n");

            }
            if (choice == 3) {
                System.out.println("Enter the ID of the student you wish to delete");
                int deleteStudent = input.nextInt();
                binarySearch.deleteNode(deleteStudent);

            }
            if (choice == 4) {
                System.out.println("Enter student's ID you wish to update");
                int updateStudentId = input.nextInt();
                System.out.println("Enter new student's name");
                String updateStudentName = input.next();
                System.out.println("Enter new student's ID");
                int newStudentId = input.nextInt();
                System.out.println("Enter new student's GPA");
                double newStudentGpa = input.nextDouble();
                newStudent = new Node(newStudentId,updateStudentName,newStudentGpa);
                binarySearch.updateNode(updateStudentId, newStudent);

            }
            if (choice == 5) {
                
                binarySearch.showAllRecords(binarySearch.root);
            }
        }
    }

 
    public static void runMenu()    {
        System.out.println("Enter: \n1 to add a new student\n" +
                "2 to lookup a student\n" +
                "3 to delete a student record\n" +
                "4 to update a student's information\n" +
                "5 to output all student records\n" +
                "6 to exit the program");
    }
}