import java.util.HashSet;
import java.util.Scanner;
public class MissingNumbers {
    public static HashSet<Integer> MissedNumber(int arr[]){
      HashSet<Integer>numbers=new HashSet<>();
      int max=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
         if(max<arr[i]){
            max=arr[i];
         }
      }
    int mark[]=new int[max+1];
    for(int i=0;i<arr.length;i++){
        mark[arr[i]]=1;

    }
    for(int i=1;i<mark.length;i++){
        if(mark[i]==0){
           numbers.add(i); 
        }
    }
    return numbers;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int n=sc.nextInt();
        System.out.println("Enter elements of a array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer>number=MissedNumber(arr);
        System.out.println("Missed Numbers in an array are "+number);
    }
}
