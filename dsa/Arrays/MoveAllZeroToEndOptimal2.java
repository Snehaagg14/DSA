import  java.util.Scanner;
public class MoveAllZeroToEndOptimal2 {
    public static void FinalArray(int arr[]){
        int j=0;

       for(int i=0;i<arr.length;i++){
          if(arr[i]!=0){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           j++;
          }
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int n=sc.nextInt();
        System.out.println("Enter elements of an array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        FinalArray(arr);
        System.out.println("Final Array :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+"\t");
        }
    }
}
