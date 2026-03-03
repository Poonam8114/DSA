
//find the sum of element
package Arraylevel1;
public class sumofelement {
static int sumofelement(int[]arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
    
    return sum;
}
    public static void main(String[] args) {
        int arr[]={12,23,34,12};
        int result=sumofelement(arr);
        System.out.println("sum of element is::"+result);
    }
}
