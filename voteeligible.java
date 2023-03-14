import java.util.Scanner;
public class voteeligible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("Enter Your Age");
        age=sc.nextInt();
        if (age>18)
        {
            System.out.println("You are Eligible for Vote");
        }
        else
        {
            System.out.println("Sorry You are not Eligible for Vote");
        }
    }
}
