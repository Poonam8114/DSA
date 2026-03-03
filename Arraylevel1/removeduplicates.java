//remove duplicates from sorted array
package Arraylevel1;

public class removeduplicates {
    public static int removeduplicates(int[]arr)
    {
        // if(arr.length==0)
        //     return 0;
        int j=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[j])
            {
                j++;
                arr[j]=arr[i];
            }
        }
return j+1;
    }
    public static void main(String[] args) {
        {
            int arr[]={12,12,13,13};
            int newlength=removeduplicates(arr);
             for(int i=0;i<newlength;i++){
                System.out.println(arr[i]);
             }
           
        }
    }
    
}
