import java.util.Scanner;
public class coll
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i,max=0,index=0;
        for(i=a;i<=b;i++)
        {
            int j=i;
            int c=0;
            while(j>1)
            {
                if(j%2==0)
                {
                    j=j/2;
                    c+=1;
                }
                else
                {
                    j=(j*3)+1;
                    c+=1;
                }
            }
            if(c>max)
            {
                max=c;
                index=i;
            }
        }
        System.out.print(index);
    }
}