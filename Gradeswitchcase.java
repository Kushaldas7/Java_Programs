import java.util.Scanner;
public class Gradeswitchcase
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int subject1,subject2,subject3,subject4;
        System.out.println("Enter marks of three subject");

        subject1=sc.nextInt();
        subject2=sc.nextInt();
        subject3=sc.nextInt();
        subject4=sc.nextInt();
        int avarage=(subject1+subject1+subject3+subject4)/4;
        System.out.println("Total Avarage is: "+avarage);
        switch(avarage/10)
        {

            case 9:
                System.out.println("Grade-O");
                break;
            case 8:
                System.out.println("Grade-E");
                break;
            case 7:
                System.out.println("Grade-A");
                break;
            case 6:
                System.out.println("Grade-B");
                break;
            case 5:
                System.out.println("Grade-C");
                break;
            case 4:
                System.out.println("Grade-D");
                break;
            default:
                System.out.println("Fail");

        }
    }
}
