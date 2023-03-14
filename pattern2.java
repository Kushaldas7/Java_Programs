import java.util.Scanner;
public class pattern2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int count=0;
        System.out.println("Enter range");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                count=count+1;
                System.out.print(count);
            }
            System.out.println( );
        }
    }
}
