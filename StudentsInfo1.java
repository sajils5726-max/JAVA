import java.util.Scanner;

class Students
 {
    int sNo, marks;
    String sName;

    // Constructor
    Students(int sNo, String sName, int marks) {
        this.sNo = sNo;
        this.sName = sName;
        this.marks = marks;
    }
}

class StudentsInfo1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = s.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Invalid number of students.");
            return;
        }

        Students[] st = new Students[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("Enter the student number: ");
            int sno = s.nextInt();
            s.nextLine(); // clear buffer

            System.out.print("Enter the student Name: ");
            String name = s.nextLine();

            System.out.print("Enter the marks of the student: ");
            int marks = s.nextInt();

            st[i] = new Students(sno, name, marks);
        }

        System.out.print("\nEnter the student number to search: ");
        int searchSno = s.nextInt();

        boolean found = false;

        for (Students str : st) {
            if (str.sNo == searchSno) {
                System.out.println("\nStudent Found:");
                System.out.println("Student Name: " + str.sName);
                System.out.println("Student Number: " + str.sNo);
                System.out.println("Student Marks: " + str.marks);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with student number " + searchSno + " not found.");
        }

        s.close();
    }
}