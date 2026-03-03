//find largest array element
package Arraylevel1;

public class largestelement {   

 static int largestelement(int[] arr) {
    int max=arr[0];
    for(int i=0;i<arr.length;i++)
    {
if(arr[i]>max)
{
    max=arr[i];
    
}
    }
    return max;
}
    
    public static void main(String[] args)
    {
        int arr[]={20,10,45,12};
        int result=largestelement(arr);
        System.out.println("largest element"+result);
    }
    
}

