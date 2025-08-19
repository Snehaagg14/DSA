import java.util.*;
public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
            
        }
        int Largest=LarNum(arr);
        int Smallest=smallNum(arr);
        System.out.println("Largest Number: "+Largest);
        System.out.println("Smallest Number: "+Smallest);
    }
    public static int LarNum(int arr[]){
        int lar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(lar<arr[i]){
              lar=arr[i];
            }
        }
        return lar;
    }
    public static int smallNum(int arr[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
              small=arr[i];
            }
        }
        return small;
    }
    
}