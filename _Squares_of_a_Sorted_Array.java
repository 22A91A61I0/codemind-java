import java.util.Arrays;
import java.util.Scanner;
public class squ
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for(int each:arr)
        {
            System.out.print(each+" ");
        }
    }
}