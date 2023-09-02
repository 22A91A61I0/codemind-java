import java.util.Scanner;
public class cam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i,c=0;
        for(i=1;i<s.length()-1;i++)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {
                c+=1;
            }
        }
        System.out.print(c+1);
    }
}