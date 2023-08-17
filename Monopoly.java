import java.util.Scanner;
public class clim
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a+b<c)
            {
                System.out.printf("YES
");
            }
            else if(b+c<a)
            {
                System.out.printf("YES
");
            }
            else if(c+a<b)
            {
                System.out.printf("YES
");
            }
            else
            {
                System.out.printf("NO
");
            }
        }
    }
}