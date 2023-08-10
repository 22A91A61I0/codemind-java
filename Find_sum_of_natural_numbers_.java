import java.util.Scanner;
public class nat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=(n*(n+1))/2;
        System.out.printf("%d",a);
    }
}