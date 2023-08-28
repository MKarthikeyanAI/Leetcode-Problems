import java.util.*;
//Two Pointer Method:
//Opposite Directional Method
class Solution12{
    public int[] sum_two_pointer(int[] arr,int k)
    {
        int start=0,end=arr.length-1;
        int[] result = new int[2];
        while(start<end)
        {
            int sum=arr[start]+arr[end];
            if(sum==k)
            {
                result[0]=start+1;
                result[1]=end+1;
                break;
            }
            else if(sum<k)
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return result;
    }
}
public class two_sum_two_pointer {
    public static void main(String args[])
    {
        Scanner d = new Scanner(System.in);
        System.out.printf("Enter the number of elements: ");
        int n=d.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=d.nextInt();
        }
        System.out.println("Enter the Target of the Sum: ");
        int k = d.nextInt();
        Solution12 sol = new Solution12();
        int[] results = sol.sum_two_pointer(arr,k);
        if(results.length==2)
        {
            System.out.println("Index1 : "+results[0]+" Index2 : "+results[1]);
        }
        else{
            System.out.println("No Index found");
        }

    }
}
