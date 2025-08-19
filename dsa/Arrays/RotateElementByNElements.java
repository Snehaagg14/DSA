import java.util.*;
public class RotateElementByNElements {
    public static void RotatedArray(int arr[],int n){
     ReversedArray(arr,0,n-1);
     ReversedArray(arr,n,arr.length-1);
     ReversedArray(arr,0,arr.length-1);
    }
    public static void ReversedArray(int arr[],int start,int end){
      while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
      }
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter element of an array: ");
    int n=sc.nextInt();
    System.out.println("Enter elements of an array: ");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Place from which need to rotate an array: ");
    int place=sc.nextInt();
    place=place/n;
    RotatedArray(arr,place);
    System.out.println("Sorted Array: ");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+"\t");
    }
}
}
