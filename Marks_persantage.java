import java.util.Scanner;
public class Marks_persantage
{
    public static void main(String args[])
    {
        float total=0;
        System.out.println("Welcome To The CBSC Persentage Maker");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Total Marks");
        int Total_Marks=sc.nextInt();

        System.out.println("Enter 1st Marks");
        float s1= sc.nextFloat();
        total=total+s1;

         System.out.println("Enter 2nd Marks");
        float s2= sc.nextFloat();
        total=total+s2;

         System.out.println("Enter 3rd Marks");
        float s3= sc.nextFloat();
        total=total+s3;

         System.out.println("Enter 4th Marks");
        float s4= sc.nextFloat();
        total=total+s4;

         System.out.println("Enter 5th Marks");
        float s5= sc.nextFloat();
        total=total+s5;

        float Grandtotal=total*100/(Total_Marks*5);
        System.out.println("Total Persentage is=" +Grandtotal+ "persent");

    }
}