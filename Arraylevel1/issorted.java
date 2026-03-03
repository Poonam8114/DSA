//check if array is sorted
package Arraylevel1;

public class issorted {
    public static  boolean issorted(int[]arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }
        return true;
    }

public static void main(String[] args)
{
int arr[]={12,34,23,34,35};
//int arr[]={1,2,3,4,5};
    if(issorted(arr)){
        System.out.println("array is sorted");
    }
    else{
        System.out.println("array is not sorted");
    }

}}