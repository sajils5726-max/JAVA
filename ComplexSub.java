public class ComplexSub
{
   double rl,im;
   ComplexSub(double r,double i)
   {
       rl=r;
       im=i;
   }
   public static ComplexSub Substraction(ComplexSub c1,ComplexSub c2)
   {
    ComplexSub temp=new ComplexSub(0,0);
    temp.rl=c1.rl-c2.rl;
    temp.im=c1.im-c2.im;
    return temp;
   }
   public static void main(String args[])
   {
    ComplexSub c1= new ComplexSub(5.5,4);
    ComplexSub c2= new ComplexSub(1.2,3.5);
    ComplexSub temp= Substraction(c1,c2);
    System.out.println("Substraction is:"+temp.rl +"+"+ temp.im+"i");
   }
}
