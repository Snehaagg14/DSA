import java.util.HashSet;
import java.util.Scanner;
public class UnionOptimal {
    public static HashSet<Integer> Union(int arr1[],int arr2[]){
        HashSet<Integer>union=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            union.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            union.add(arr2[i]);
        }
        return union;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first array's size: ");
        int n1=sc.nextInt();
        System.err.println("Enter elements of first array: ");
        int arr1[]=new int[n1];
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
        HashSet<Integer>union=new HashSet<>();
        union=Union(arr1, arr2);
        System.out.println("Union of 2 arrays : "+union);
        }
}
