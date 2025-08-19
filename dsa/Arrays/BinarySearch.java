
import java.util.*;
public class BinarySearch {
    public static int binaryindex(int arr[],int num){
        int index=-1;
        // int len=arr.length;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>num){
                end=mid-1;
            }
            else if(arr[mid]<num){
                start=mid+1;
            }
            else{
                index=mid;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of an array:");
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to find: ");
        int num=sc.nextInt();
        int index=binaryindex(arr,num);
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element is at index "+ index);
        }

    }
    
}
