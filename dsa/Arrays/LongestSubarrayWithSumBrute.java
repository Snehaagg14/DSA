import java.util.Scanner;
public class LongestSubarrayWithSumBrute {
    public static int LongestSubarray(int arr[],int key){
        int maxlen=0;
        for(int i=0;i<arr.length;i++){
             int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==key){
                    maxlen=Math.max(maxlen, j-(i-1));
                }
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int n=sc.nextInt();
        System.out.println("Enter elements of an array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the sum you want : ");
        int key=sc.nextInt();
        int len=LongestSubarray(arr, key);
        System.out.println("Length of longest subarray whose sum is equal to "+key+" is "+len);
    }
}
