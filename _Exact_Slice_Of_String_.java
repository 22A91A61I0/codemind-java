import java.util.Scanner;
public class str
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(s.substring(a,b+1));
    }
}