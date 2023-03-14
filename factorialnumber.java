//import java.util.Scanner;
//public class factorialnumber
//{
//   public static void main(String[] args)
//   {
//       Scanner sc=new Scanner(System.in);
//       int n;
//       long factorial=1;
//       System.out.println("Enter the number");
//       n=sc.nextInt();
//       for (int i=1;i<=n;i++)
//       {
//          // factorial=factorial*i;
//           factorial *=i;
//       }
//       System.out.println("Factorial is:"+factorial);
//   }
//}
import java.util.Scanner;
public class factorialnumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        long factorial=1;
        System.out.println("Enter the number:");
        n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            factorial*=i;
        }
        System.out.println("Factorial is:"+factorial);
    }
}