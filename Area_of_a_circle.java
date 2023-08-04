import java.util.Scanner;
public class areaofcircle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double s1=sc.nextInt();
        double area=3.14*s1*s1;
        System.out.printf("%.2f",area);
    }
}