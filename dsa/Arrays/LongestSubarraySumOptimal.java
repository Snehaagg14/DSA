import java.util.Scanner;
public class LongestSubarraySumOptimal {
    public static int LongestSubarray(int arr[],int k){
        int end=0;
        int start=0;
        int sum=0;
        int len=0;
        
        while(end<arr.length){
            sum=sum+arr[end];
            
        
            // if(sum<k){
            //     sum=sum+arr[end];
            //     end++;
            // }
            if(sum>k){
                sum=sum-arr[start];
                start++;
            }
            if(sum==k){
            len=Math.max(len, (end-start));
            }
            end++;
        }
        return len;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter elements of array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the sum you want: ");
        int k=sc.nextInt();
        int len=LongestSubarray(arr,k);
        System.out.println("The length of longest subarray whose sum is equal to "+k+" is : "+len);
    }

}
