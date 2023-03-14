import java.util.Scanner;
public class Leapyearnot
{
    public static void main(String[] args)
    {
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        y=sc.nextInt();

        if((y%4==0) && (y%100==0) || (y%400==0))
        {
            System.out.println("This year is Leapyear");
        }
        else
        {
            System.out.println("This year is not Leapyear");
        }

    }
}
