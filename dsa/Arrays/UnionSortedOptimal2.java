
import java.util.ArrayList;
import java.util.Scanner;
public class UnionSortedOptimal2 {
    public static ArrayList<Integer> Union(int arr1[],int arr2[]){
      ArrayList<Integer>union=new ArrayList<>();
      int i=0;
      int j=0;
      while(i<arr1.length&&j<arr2.length){
        if(arr1[i]<arr2[j]){
            union.add(arr1[i]);
            i++;
        }
        if(arr1[i]>arr2[j]){
            union.add(arr2[j]);
            j++;
        }
        if(arr1[i]==arr2[j]){
            union.add(arr2[j]);
            i++;
            j++;
        }
      }
      while(arr1.length>i){
        union.add(arr1[i]);
        i++;
      }
      while(arr2.length>j){
        union.add(arr2[j]);
        j++;
      }
      return union;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first array's size: ");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter elements of first array: ");
        for(int i=0;i<n1;i++){
           arr1[i]=sc.nextInt();
        }
        System.out.println("Enter second array's size: ");
        int n2=sc.nextInt();
        System.out.println("Enter elements of second array: ");
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        ArrayList<Integer>union=Union(arr1, arr2);
        System.out.println("Union of two arrays: "+union);
    }
}
