//Find missing number
package Arraylevel1;

public class missingnumber {
    public static int missingnumber(int[]arr)
    {
        int n=arr.length;
        int sum=n*(n+1)/2;
        int arrsum=0;
        for(int i=0;i<arr.length;i++)
        {
            arrsum=arrsum+arr[i];
        }
        return sum-arrsum;

    }
    public static void main(String[] args) {
        int arr[]={0,1,3,4};
        int result=missingnumber(arr);
      System.out.println("missing nuber is::"+result);
    }
    
}
