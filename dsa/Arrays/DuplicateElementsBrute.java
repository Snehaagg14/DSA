import java.util.Scanner;
public class DuplicateElementsBrute {
    public static int RemoveDuplicateElements(int arr[],int n){
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
             for(int k=j;k<n-1;k++){
               arr[k]=arr[k+1];
             }
             n=n-1;
            }
        }
       }
       return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arrays size:");
        int n=sc.nextInt();
        System.out.println("Enter elements of an array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        n=RemoveDuplicateElements(arr, n);
        System.out.println("Non Duplicate array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
