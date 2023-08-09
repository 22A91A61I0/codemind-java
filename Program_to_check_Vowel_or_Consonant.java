import java.util.Scanner;
public class num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.printf("Vowel");
        }
        else
        {
            System.out.printf("Consonant");
        }
    }
}