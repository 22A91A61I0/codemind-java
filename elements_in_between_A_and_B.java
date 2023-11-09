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
        int sum=0,c=0;
        for(int i=0;i<n;i++)
        {
            if(a<=arr[i] && b>=arr[i])
            {
                System.out.print(arr[i]+" ");
            }
            else
            {
                c+=1;
            }
        }
        if(c==n)
        {
            System.out.print("-1");
        }
    }
}