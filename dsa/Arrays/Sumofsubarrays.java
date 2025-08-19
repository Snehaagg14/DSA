import java.util.*;
public class Sumofsubarrays {
    public static void Sum(int arr[]){
        int prefix[]=new int[arr.length];
        int maxsum=Integer.MIN_VALUE;
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
         prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            int currsum;
            if(i==0){
            currsum=prefix[j];
            }
            else{
            currsum=prefix[j]-prefix[i-1];
            }
            System.out.println("Sum of subarray from index"+ i +" to "+j+" : "+ currsum);
          if(maxsum<currsum){
            maxsum=currsum;
            
          } 
          
        }
        if(maxsum<arr[i]){
            maxsum=arr[i];
            
          }
    }
    System.out.println("The maximum sum of subarray: "+ maxsum);
  }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array's size");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter elements of an array:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    Sum(arr);
 }   
}
