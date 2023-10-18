import java.util.Scanner;
public class add
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr1=new int[n][n];
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
            {
                arr1[j][k]=sc.nextInt();
            }
        }
        int[][] arr2=new int[n][n];
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
            {
                arr2[j][k]=sc.nextInt();
            }
        }  
        int[][] res=new int[n][n];
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
            {
                res[j][k]=arr1[j][k]+arr2[j][k];
            }
        }
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
            {
                System.out.print(res[j][k]+" ");
            }
            System.out.println();
        }
    }
}