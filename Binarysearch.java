import java.util.Arrays;
class BinarySearch
{
public static void main(String arg[])
{
int arr[]={10,20,30,40,50,60,70,80,90,100};
int key = 70;
int result =Arrays.binarySearch(arr, key);
if(result<0)
System.out.println("Element not found");
else
System.out.println("Element is found at index:" +result);
}
}