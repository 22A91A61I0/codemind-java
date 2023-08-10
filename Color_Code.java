import java.util.Scanner;
public class nat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        if(n=='V'||n=='v')
        {
            System.out.print("Violet");
        }
        else if(n=='I'||n=='i')
        {
            System.out.print("Indigo");
        }
        else if(n=='B'||n=='b')
        {
            System.out.print("Blue");
        }
        else if(n=='G'||n=='g')
        {
            System.out.print("Green");
        }
        else if(n=='Y'||n=='y')
        {
            System.out.print("Yellow");
        }
        else if(n=='O'||n=='o')
        {
            System.out.print("Orange");
        }
        else if(n=='R'||n=='r')
        {
            System.out.print("Red");
        }
        else
        {
            System.out.print("-1");
        }
    }
}