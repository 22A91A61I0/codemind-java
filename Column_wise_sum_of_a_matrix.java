import java.util.Scanner;
public class mat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        int i,j;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<c;i++)
        {
            int sum=0;
            for(j=0;j<r;j++)
            {
                sum+=arr[j][i];
            }
            System.out.print(sum+" ");
        }
    }
}