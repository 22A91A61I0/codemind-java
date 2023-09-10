import java.util.Scanner;
public class squ
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
        int max=0,index=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=i;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c+=1;
                }
            }
            if(c>max)
            {
                max=c;
                index=arr[i];
            }
            else if(c==max)
            {
                index=Math.min(index,arr[i]);
            }
        }
        System.out.print(index);
    }
}