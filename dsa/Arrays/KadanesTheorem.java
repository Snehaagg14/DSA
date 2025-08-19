import java.util.*;
// max sub array sum
public class KadanesTheorem {
    public static void maxsum(int arr[]){
      int currsum=0;
      int maxsum=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
        currsum=currsum+arr[i];
       
        if(currsum<0){
            currsum=0;
        }
         maxsum=Math.max(maxsum,currsum);
      }
      System.out.println("The maximum sum of an subarray: "+ maxsum);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array's size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        maxsum(arr);
    }
}
