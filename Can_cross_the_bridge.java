import java.util.Scanner;
public class can
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int a=(z-y)/x;
        System.out.printf("%d",a);
    }
}