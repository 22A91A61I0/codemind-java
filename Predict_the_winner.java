import java.util.Scanner;
public class pre
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i,sum=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        if(sum%4==0)
        {
            System.out.print("X");
        }
        else
        {
            System.out.print("Y");
        }
    }
}