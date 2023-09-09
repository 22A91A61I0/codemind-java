import java.util.Scanner;
public class mon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int s=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=s)
            {
                c+=1;
            }
            else
            {
                break;
            }
        }
        if(c!=n)
        {
           System.out.print(c);   
        }
        else
        {
            System.out.print("-1");
        }
    }
}