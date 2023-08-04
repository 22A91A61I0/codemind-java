import java.util.Scanner;
public class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double num1,num2,num3;
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        num3=sc.nextDouble();
        double s=(num1+num2+num3)/2;
        double a=Math.sqrt(s*(s-num1)*(s-num2)*(s-num3));
        System.out.printf("%.2f",a);
    }
}