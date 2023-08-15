import java.util.Scanner;
public class ele
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int u=sc.nextInt();
        double b;
        if(u<=199)
        {
            b=u*1.20;
        }
        else if(u>=200 && u<400)
        {
            b=u*1.50;
        }
        else if(u>=400 && u<600)
        {
            b=u*1.80;
        }
        else
        {
            b=u*2.00;
        }
        if(b>400)
        {
            System.out.printf("%.2f",b+(15*b)/100);
        }
        else
        {
            System.out.printf("%.2f",b+100);
        }
    }
}