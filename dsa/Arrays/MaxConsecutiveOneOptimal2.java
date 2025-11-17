import java.util.Scanner;
public class MaxConsecutiveOneOptimal2 {
    public static int MaximumConsecutiveOne(int arr[]){
        int currone=0;
        int maxone=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
             currone=currone+1;
             maxone=Math.max(currone, maxone);

            }
            if(arr[i]==0){
                currone=0;
            }
        }
        return maxone;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the array's size: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of an array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    int maxone=MaximumConsecutiveOne(arr);
    System.out.println("Maximum Consecutive One in an array : "+ maxone);
    }

}
