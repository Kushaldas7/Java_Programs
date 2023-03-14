import java.util.Scanner;
public class usergratestnum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
        int a=sc.nextInt();
        if(a>10)
        {
            System.out.println("This number is gratest");
        }
        else
        {
            System.out.println("This number is Lowest");
        }
       // System.out.println(a>7);
    }
}
