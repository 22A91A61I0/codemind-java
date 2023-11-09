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
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==a)
            {
                sum+=1;
            }
        }
        if(sum!=0)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}