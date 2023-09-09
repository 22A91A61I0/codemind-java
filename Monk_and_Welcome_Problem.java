import java.util.Scanner;
public class mon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int[] sum=new int[n];
        for(int i=0;i<n;i++)
        {
            sum[i]+=arr[i]+arr1[i];
            System.out.print(sum[i]+" ");
        }
    }
}