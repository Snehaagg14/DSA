import java.util.*;
public class TrappingRainwater {
    public static void trappedrainwater(int arr[],int w){
      int left[]=new int[arr.length];
      int right[]=new int[arr.length];
      left[0]=arr[0];
      for(int i=1;i<arr.length;i++){
        left[i]=Math.max(left[i-1],arr[i]);
      }
      right[arr.length-1]=arr[arr.length-1];
      for(int j=arr.length-2;j>=0;j--){
        right[j]=Math.max(right[j+1],arr[j]);
      }
      int water=0;
      for(int i=0;i<arr.length;i++){
         water=water+(((Math.min(right[i],left[i]))-arr[i])*w);
      }
      System.out.println("total trapped rainwater between bars: "+ water);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of bars:");
        int n=sc.nextInt();
        System.out.println("Enter heights of bars:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Width of the bars: ");
        int w=sc.nextInt();
        trappedrainwater(arr,w);
    }
}
