
import java.util.*;
public class RotateElementByOnePlace {
    // Brute Approach
    // public static void RotatedArray(int arr[]){
    //     int temp=arr[0];
    //     for(int i=0;i<arr.length-1;i++){
    //         int temp1=arr[i];
    //         arr[i]=arr[i+1];

    //     }
    //     arr[arr.length-1]=temp;
    // }
    
    // Optimal Approach 
    public static void RotatedArray(int arr[]){
          int start=1;
          int end=arr.length-1;
          while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
    }
         start=0;
         end=arr.length-1;
         
        //  int end1=arr.length-1;
         while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
         }
        }
    // Using 2 functions.
    //     public static void RotatedArray(int arr[]){
    //         ReversedArray( arr, 1, arr.length-1);
    //         ReversedArray(arr,0,arr.length-1);

    //     }
    // public static void ReversedArray(int arr[],int start,int end){
    //      while(start<end){
    //         int temp=arr[start];
    //         arr[start]=arr[end];
    //         arr[end]=temp;
    //         start++;
    //         end--;
    //      }
    // }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array's size: ");
        int n=sc.nextInt();
        System.out.println("Enter elements of an array; ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        RotatedArray(arr);
        System.out.println("Rotated array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
