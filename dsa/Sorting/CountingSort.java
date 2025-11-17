import java.util.Scanner;
public class CountingSort {
    public static void SortedArray(int arr[]){
    int max=MaxElement(arr);
    int count[]=new int[max+1];
    for(int i=0;i<arr.length;i++){
        count[arr[i]]=count[arr[i]]+1;
         }
         int k=0;
        //  int index=-1;
    for(int i=0;i<count.length;i++){
        // index=index+1;
        for(int j=0;j<count[i];j++){
            arr[k]=i;
            k++;
        }
    }
    }
    public static int MaxElement(int arr[]){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arrays size:");
        int n=sc.nextInt();
        System.out.println("Enter elements of na array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SortedArray(arr);
        System.out.println("Sorted Array:");
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+"\t");
        }

        
        
    }
}
