import java.util.Scanner;
public class max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i,j,c=0,maxval=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                c+=1;
                maxval=Math.max(maxval,c);
            }
            else
            {
                c=0;
            }
        }
        System.out.print(maxval);
    }
}