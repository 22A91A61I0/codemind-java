import java.util.Scanner;
public class cli
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1,b=1,c=0;
        for(int i=0;i<n-1;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.print(c);
    }
}