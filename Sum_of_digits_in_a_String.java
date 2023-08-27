import java.util.Scanner;
public class cou
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int sum=0;
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isDigit(s1.charAt(i)))
            {
                sum+=Character.getNumericValue(s1.charAt(i));
            }
        }
        System.out.print(sum);
    }
}