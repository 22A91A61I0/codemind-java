import java.util.Scanner;
public class las
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        double c=(f-32)/1.8;
        System.out.printf("%.2f",c);
    }
}