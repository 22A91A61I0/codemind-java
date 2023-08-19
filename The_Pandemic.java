import java.util.Scanner;
public class car
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.print("0");
        }
        else if(n==2)
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("2");
        }
    }
}