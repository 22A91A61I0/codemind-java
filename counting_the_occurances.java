import java.util.Scanner;
public class cou
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        char c=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==c)
            {
                count+=1;
            }
        }
        if(count!=0)
        {
            System.out.print(count);
        }
        else
        {
            System.out.print("-1");
        }
    }
}