import java.util.*;
public class SortedArray {
    public static int SortedOrNot(int arr[]){
        int flag=-1;
        for(int i=0;i<arr.length-1;i++){
           if(arr[i]>arr[i+1])
           flag=1;
           break;
        }
        return flag;
    }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the array's size: ");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the elements of an array: ");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       int flag=SortedOrNot(arr);
       if(flag==-1){
        System.out.println("The array is sorted.");
       }
       else{
        System.out.println("The array is not sorted.");
       }
       

   } 
}
