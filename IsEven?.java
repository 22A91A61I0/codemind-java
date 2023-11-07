import java.util.Scanner;
public class cli
{
    public static int num(int n)
    {
        if(n%2==0)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=num(n);
        System.out.print(res);
    }
}