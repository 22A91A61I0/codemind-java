import java.util.Scanner;
public class car
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b)
        {
            System.out.printf("%d",(a+b+c)/b);
        }
        else
        {
            System.out.printf("-1");
        }
    }
}