import java.util.Scanner;
public class primenumber
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter number");
        n=input.nextInt();
        boolean flag=false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=true;
                break;
            }
        }
        if(flag==false)
            System.out.println("prime number");
        else
            System.out.println("Not prime");
    }
}
