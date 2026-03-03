//move zero to end

package Arraylevel1;
public class movezerotoend {
    public static void movezerotoend(int[]arr)
    {
int j=0;
for(int i=0;i<arr.length;i++)
{
    if(arr[i]!=0)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        j++;
    }
}
}  
    public static void main(String[] args) {
        int arr[]={23,34,0,0,78};
        movezerotoend(arr);
        for(int i=0;i<arr.length;i++)
{
    System.out.println(arr[i]);
}

    }
}