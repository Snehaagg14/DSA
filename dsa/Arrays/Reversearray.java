import java.util.*;
public class Reversearray {
    public static void reversedarray(int arr[]){
        int start=0;
        int end=arr.length-1;
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
        System.out.println("Enter array's size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of a array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reversedarray(arr);
        System.out.println("Reversed array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
