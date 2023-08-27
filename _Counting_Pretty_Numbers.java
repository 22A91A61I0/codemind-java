import java.util.Scanner;
public class cou
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int c=0;
            for(int j=x;j<=y;j++)
            {
                int r=j%10;
                if(r==2 || r==3 || r==9)
                {
                    c+=1;
                }
            }
            System.out.println(c);
        }
    }
}