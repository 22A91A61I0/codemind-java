import java.util.Scanner;
public class bet
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(a<=arr[i] && b>=arr[i])
            {
                sum+=arr[i];
            }
        }
        System.out.print(sum);
    }
}