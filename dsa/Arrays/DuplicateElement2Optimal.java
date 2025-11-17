import java.util.HashSet;
import java.util.Scanner;
public class DuplicateElement2Optimal {
    public static int NonDuplicateElement(int arr[]){
        HashSet<Integer>set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        // int n=set.size();
        int j=0;
        for(int num:set){
           arr[j++]=num;
        }
        
        return j;
    }

    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter array's size:");
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     n= NonDuplicateElement(arr);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+"\t");
    }
    }
}
