import java.util.Scanner;
public class pal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String r="";
        for(int i=s.length()-1;i>=0;i--)
        {
            r+=s.charAt(i);
        }
        if(s.equalsIgnoreCase(r))
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}