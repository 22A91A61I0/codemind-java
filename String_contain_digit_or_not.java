import java.util.Scanner;
public class cou
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int c=0;
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isDigit(s1.charAt(i)))
            {
                c+=1;
            }
        }
        if(c!=0)
        {
            System.out.print("Contains "+c+ " digit ");
        }
        else
        {
            System.out.print("Doesn't"+" "+"contain"+" "+"digit");
        }
    }
}