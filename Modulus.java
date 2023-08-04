import java.util.Scanner;
public class mod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=(s1%s2);
        System.out.printf("%d",s3);
    }
}