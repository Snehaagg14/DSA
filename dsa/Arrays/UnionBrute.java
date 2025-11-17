import java.util.ArrayList;
import java.util.Scanner;
public class UnionBrute {
    public static ArrayList<Integer> Union(int arr1[],int arr2[]){
        ArrayList<Integer>union= new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            if(!union.contains(arr1[i])){
               union.add(arr1[i]);
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(!union.contains(arr2[i])){
                union.add(arr2[i]);
            }
        }
        return union;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first array's size: ");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.err.println("Enter elements of first array: ");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter second array's size:");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter elements of second array: ");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        ArrayList<Integer>union=Union(arr1, arr2);
        System.out.println("The union of  arrays is "+union);
    }
}
