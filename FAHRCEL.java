import java.util.Scanner;
class FAHRCEL
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int f;

System.out.println("Enter Fahrenheit value:");
f=input.nextInt();
double c=((f-32.0)*5.0)/9.0;
{
System.out.println("Celsius="+c);
}
}
}