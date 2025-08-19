import java.util.*;
public class SelectionSort {
    public static void sorting(int arr[]){
       
        for(int i=0;i<arr.length;i++){
             int min=i;
            for(int j=i;j<arr.length;j++){
              
              if(arr[min]>arr[j]){
                min=j;
                
              }
               int temp=arr[min];
                 arr[min]=arr[i];
                 arr[i]=temp;
            }
           
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of an array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sorting(arr);
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+"\t");
        }
    }
}
