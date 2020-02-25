class Fibonacci
{
public static void main(String arg[])
{
int n=10; int a=0; int i=1;int b=1;
int sum;
System.out.println("The Fibonacci terms" +n+"terms:");
for(i=1; i<=n; i++)
{
sum=a+b;
a=b;
b=sum;
System.out.println(sum);
}
}
}