import java.util.Arrays;
import java.util.Scanner;
public class UnionSortedOptimal {
    public static int[] Union(int arr1[],int arr2[]){
        int length=arr1.length+arr2.length;
        int union[]=new int[length];
        int index=0;
        int i=0;
        int j=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                union[index]=arr1[i];
                i++;
                index++;
            }
            if(arr1[i]>arr2[j]){
                union[index]=arr2[j];
                j++;
                index++;
            }
            if(arr1[i]==arr2[j]){
                union[index]=arr1[i];
                i++;
                j++;
                index++;
            }
        }
        while (i < arr1.length) {
    union[index++] = arr1[i++];
}

while (j < arr2.length) {
    union[index++] = arr2[j++];
}

        return Arrays.copyOf(union, index);

    }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter first array's size: ");
       int n1=sc.nextInt();
       System.out.println("Enter element of first array: ");
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
       int union[]=Union(arr1, arr2);
       System.out.println("Union of two array: ");
       for(int i=0;i<union.length;i++){
        System.out.print(union[i]+"\t");
       }
   } 
}
