//count odd and even
package Arraylevel1;

public class oddandeven {

    public static void oddandeven(int arr[]){
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }else
            {
                odd++;
               
            }
        }
                System.out.println("even" +even); 
              System.out.println("odd"+odd);

    }
    public static void main(String[]args)
    {
int arr[]={12,34,23,34};
                oddandeven(arr);
    }
    
}
