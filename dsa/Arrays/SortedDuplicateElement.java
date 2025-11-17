import java.util.Scanner;
public class SortedDuplicateElement {
    public static int NonDuplicateElements(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]!=arr[j]){
            j++;
            arr[j]=arr[i];
        }
        }
        return j+1;
    }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter array's size:");
       int n=sc.nextInt();
       System.out.println("Enter elements of array: ");
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       n=NonDuplicateElements(arr);
       System.out.println("Non duplicate array: ");
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+"\t");
       }
   } 
}
