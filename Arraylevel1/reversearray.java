package Arraylevel1;

public class reversearray {
   
static void reversearray(int[]arr)
   {
    int start=0;
    int end=arr.length-1;
    while (start<end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;        
    }
   }
public static void main(String[] args) {
    int arr[]={12,45,23,45,56};
   reversearray(arr);
   System.out.println("reversed array is");
   for(int i=0;i<arr.length;i++)
   {
    System.out.println(arr[i]+"");
   }
 
}



}
