import java.util.Scanner;
public class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double s1=sc.nextDouble();
        double s2=sc.nextDouble();
        double s3=sc.nextDouble();
        double s=(s1+s2+s3)/2;
        double a=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.printf("%.2f",a);
    }
}