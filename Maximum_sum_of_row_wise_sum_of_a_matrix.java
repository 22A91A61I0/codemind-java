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
        int max=0;
        for(i=0;i<r;i++)
        {
            int sum=0;
            for(j=0;j<c;j++)
            {
                sum+=arr[i][j];
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        System.out.print(max);
    }
}