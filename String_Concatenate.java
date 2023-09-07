import java.util.Scanner;
import java.util.Arrays;
public class alp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s3=s1+s2;
        char[] arr=s3.toCharArray();
        Arrays.sort(arr);
        System.out.print(arr);
    }
}