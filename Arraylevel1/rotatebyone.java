
//rotate array by one
package Arraylevel1;

public class rotatebyone {
public static void rotatebyone(int[]arr)
{

    int last=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];

        }
        arr[0]=last;
}
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        rotatebyone(arr);
        System.out.println("after rotation");

          for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

}
