import java.util.Scanner;
public class EmpNetPay
{
    int empid, TA, DA, HRA, T ax, netsal, basic;
    String empname;
    void getdata()
    {
        Scanner scan = new Scanner(System.in);
        System. out println("Enter Employee name, id, Basic Pay, TA, DA, HRA and Tax");
        empname = scan.nextLine();
        empid = scan.nextlnt();
        basic=scan.nextlnt():
        TA = scan.nextlnt();
        DA = scan.nextint();
        HRA = scan.nextlnt();
        Tax = scan.nextint();
    }
    void calc()
    {
        netsal=(basiC+TA+DA+HRA)-Tax
        System.out println("Net Salary:"+netsal);
    }
    public static void main( String args[])
    {
        EmpNetPay e1 = new EmpNetPay0;e1.getdata0;
        System.out.println("InEmployee Details");
        System. out println("-----------------");
        System.out, println("Employee ID: "+e1.empid);
        System.out.printn("Employee name:"+e1.empname);
        e1.calc();
    }
}