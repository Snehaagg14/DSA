import java.util.*;
public class LinearSearch {
    public static int linearIndex(int arr[],int num){
       int index=-1;
       for(int i=0;i<
       arr.length;i++){
        if(num==arr[i]){
           index=i;
           break;
        }
       }
       return index;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of an array");
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt(); 
        }
        System.out.println("enter element to find:");
        int num=sc.nextInt();
        int index=linearIndex(arr,num);
        if(index==-1){
            System.out.println("Number not found");
        }
        else{
        System.out.println("Number is at index "+index);
        }
    }
}
