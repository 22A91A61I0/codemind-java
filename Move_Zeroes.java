import java.util.Scanner;
public class max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i,j,count=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        }
        while(count<n)
        {
            arr[count++]=0;
        }
        for(j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}