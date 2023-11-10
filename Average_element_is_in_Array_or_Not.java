import java.util.Scanner;
public class las
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
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        double avg=sum/n;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==avg)
            {
                c+=1;
            }
        }
        if(c!=0)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}