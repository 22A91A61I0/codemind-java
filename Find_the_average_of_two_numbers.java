import java.util.Scanner;
public class avg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double s1=sc.nextDouble();
        double s2=sc.nextDouble();
        double s=(s1+s2)/2;
        System.out.printf("%.4f",s);
    }
}