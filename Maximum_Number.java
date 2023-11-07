import java.util.Scanner;
public class cli
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='6')
            {
                arr[i]='9';
                break;
            }
        }
        System.out.print(arr);
    }
}