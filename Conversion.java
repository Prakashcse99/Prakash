import java.util.Scanner;
class Conversion
{
public static void main(String ar[])
{
float cm,m,km;
System.out.println("Enter the distance in centimeter");
Scanner s = new Scanner(System.in);
cm = s.nextInt();
m = cm/100;
km = cm/100000;
System.out.println("Length in meters="+m);
System.out.println("Length in kilometers="+km);
}
}