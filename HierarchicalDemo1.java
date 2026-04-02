import java.util.Scanner;

class Hospital {
    String HsptName;

    Hospital(String hname) {
        HsptName = hname;
    }
}

class Doctor extends Hospital {
    String DrName;

    Doctor(String hname, String dname) {
        super(hname);
        DrName = dname;
    }

    void putdata() {
        System.out.println("Hospital: " + HsptName);
        System.out.println("Doctor: " + DrName);
    }
}

class Nurse extends Hospital {
    String NursName;

    Nurse(String hname, String nname) {
        super(hname);
        NursName = nname;
    }

    void putdata() {
        System.out.println("Hospital Name: " + HsptName);
        System.out.println("Nurse Name: " + NursName);
    }
}

public class HierarchicalDemo1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Details");
        System.out.print("Hospital Name: ");
        String h = s.next();

        System.out.print("Doctor Name: ");
        String d = s.next();

        System.out.print("Nurse Name: ");
        String n = s.next();

        // Object creation
        Doctor ob1 = new Doctor(h, d);
        Nurse ob2 = new Nurse(h, n);

        System.out.println("\nHospital - Doctor Details");
        System.out.println("--------------------------");
        ob1.putdata();

        System.out.println("\nHospital - Nurse Details");
        System.out.println("--------------------------");
        ob2.putdata();

        s.close();
    }
}