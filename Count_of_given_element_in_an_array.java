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
        int k=sc.nextInt();
        int c=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==k)
            {
                c+=1;
            }
        }
        if(c!=0)
        {
            System.out.print(c);
        }
        else
        {
            System.out.print("0");
        }
    }
}