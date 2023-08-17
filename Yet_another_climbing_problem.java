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
            if(a%b==0)
            {
                System.out.printf("%d
",a/b);
            }
            else
            {
                System.out.printf("%d
",(a/b)+(a%b));
            }
        }
    }
}