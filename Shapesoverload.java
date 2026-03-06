import java.util.Scanner;
public class Shapesoverload
 {
    void area(int r1)
    {
        System.out.println("\n area of circle wih radius"+r1+"="+3.14*r1*r1);
    }
    void area(int l1,int b1)
    {
        System.out.println("\n area of rectangle with dimensions"+l1+"X"+b1+"="+l1*b1);
    }
    void area(int l2,int b2,int h2)
    {
        System.out.println("\n area of cuboid with dimensions"+l2+"X"+b2+"X"+h2+"="+l2*b2*h2);
    }
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("\n enter the length");
        int l=s.nextInt();
        System.out.println("\n enter the breadth");
        int b=s.nextInt();
        System.out.println("\n enter the height");
        int h=s.nextInt();
        System.out.println("\n enter the radius");
        int r=s.nextInt();
        Shapesoverload ob= new Shapesoverload();
        ob.area(r);
        ob.area(l,b);
        ob.area(l,b,h);
    }

}
    
        

    
