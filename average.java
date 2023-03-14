import java.util.Scanner;
class average
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int m1,m2,m3;
System.out.println("Enter three number");
m1=input.nextInt();
m2=input.nextInt();
m3=input.nextInt();

int total=m1+m2+m3;
double avg=total/3.0;
{
System.out.println("Average of the three marks is:"+avg);
}
}
}