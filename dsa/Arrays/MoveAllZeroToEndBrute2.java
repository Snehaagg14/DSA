import java.util.Scanner;
public class MoveAllZeroToEndBrute2 {
    public static void FinalArray(int arr[]){
        int n=arr.length;
        int j=0;
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
              arr1[j]=arr[i];
              j++;  
            }
         }
         for(int i=0;i<j;i++){
            arr[i]=arr1[i];
         }
         for(int i=j;i<arr.length;i++){
            arr[i]=0;
         }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of an array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        FinalArray(arr);
        System.out.println("Final array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
