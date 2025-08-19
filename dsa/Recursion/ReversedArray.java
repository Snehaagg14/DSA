import java.util.*;
public class ReversedArray {
    public static void ReversedArray(int arr[],int start,int end){
        if(start<end){
       int temp=arr[start];
       arr[start]=arr[end];
       arr[end]=temp;
       ReversedArray(arr,start+1,end-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int n=sc.nextInt();
        System.out.println("Enterr the elements of an array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       ReversedArray(arr, 0, n-1);
       System.out.println("Reversed Array: ");
       for(int i=0;i<n;i++){
         System.out.print(arr[i]+"\t");
       }
    }
}
