public class recursivebinary 
{
    int binarySearch(int arr[],int x)
    {
        int l=0;
        int r=arr.length-1;

        while(l<=r)
        {
            int m=l+(r-1)/2;
            if(arr[m]==x)
            {
                return m;
            }
            if(arr[m]<x)
            {
                l=m+l;
            }
            else
            {
                r=m-l;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        recursivebinary rb= new recursivebinary();
        int arr[] = {2,3,4,10,40};
        int x = 10;
        int result = rb.binarySearch(arr, x);
        if(result==-1)
        {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+result);
        }

    }
}
