import java.util.Scanner;

public class Emp
{
    int empno;
    String name;

    void getData()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        name = scan.nextLine();   // String input

        System.out.println("Enter Employee No:");
        empno = scan.nextInt();  // Integer input
    }

    void display()
    {
        System.out.println("Employee Name: " + name); 
        System.out.println("Employee No: " + empno); 
    }

    public static void main(String[] args)
    {
        Emp e = new Emp();
        e.getData();

        System.out.println("\nEmployee Details");
        System.out.println("---------------------");

        e.display();
    }
}
