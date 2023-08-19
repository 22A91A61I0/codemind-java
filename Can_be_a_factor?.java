import java.util.Scanner;
public class car
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            float z=Math.abs(a-b);
            if(z>=a)
            {
                System.out.println("YES");
            }
            else if(a==b)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}