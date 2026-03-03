package Arraylevel1;

public class smallestelement {   

 static int smallestelement(int[] arr) {
    int min=arr[0];
    for(int i=0;i<arr.length;i++)
    {
if(arr[i]<min)
{
    min=arr[i];
    
}
    }
    return min;
}
    
    public static void main(String[] args)
    {
        int arr[]={20,10,45,12};
        int result=smallestelement(arr);
        System.out.println("smallest element"+result);
    }
    
}

