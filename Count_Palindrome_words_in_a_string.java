import java.util.Scanner;
public class squ
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.split(" ");
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            String s1="";
            for(int j=arr[i].length()-1;j>=0;j--)
            {
                s1+=arr[i].charAt(j);
            }
            if(arr[i].equalsIgnoreCase(s1))
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}