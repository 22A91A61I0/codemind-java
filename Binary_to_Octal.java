import java.util.Scanner;
public class bi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String a=sc.next();
            int b=Integer.parseInt(a,2);
            System.out.println(Integer.toString(b,8));
        }
    }
}