import java.util.Scanner;
public class squ
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int cou=0;
        for(int i=0;i<c;i++)
        {
            int co=0;
            int co1=0;
            for(int j=0;j<r-1;j++)
            {
                if(arr[j][i]==arr[j+1][i])
                {
                    co+=1;
                    co1+=1;
                }
                if(arr[j][i]<arr[j+1][i])
                {
                    co+=1;
                }
                else if(arr[j][i]>arr[j+1][i])
                {
                    co1+=1;
                }
            }
            if(co==r-1 || co1==r-1)
            {
                cou+=1;
            }
        }
        System.out.print(cou);
    }
}