import java.util.*;
public class Frequency 
{
    public static void main(String args[])
    {
        int arr[] = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to find the frequency of");
        int n= sc.nextInt();
        int len = arr.length;
        int count=0;
        for(int i=0;i<len;i++)
        {
          if(arr[i]==n)
          {
              count++;
          }
        }
        if(count>0)
        {
          System.out.println("Frequency of the selected element is :"+count);
        }
        else
        {
          System.out.println("Element not present in the array");
        }
    }
}
