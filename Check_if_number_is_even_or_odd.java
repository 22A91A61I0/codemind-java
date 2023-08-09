import java.util.Scanner;
public class num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.printf("Even");
        }
        else
        {
            System.out.printf("Odd");
        }
    }
}