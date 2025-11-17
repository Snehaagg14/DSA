import java.util.Scanner;
public class MoveAllZeroToEndOptimal {
    public static void FinalArray(int arr[]){
        int n=arr.length;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
             arr[index]=arr[i];
             index++;
            }
            
        }
        while(index<n){
                arr[index]=0;
                index++;
            }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int n=sc.nextInt();
        System.out.println("Enter elements of an array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        FinalArray(arr);
        System.out.println("Final Array: ");
        for(int i=0;i<n;i++){
            System.err.println(arr[i]+"\t");
        }
    }
}
