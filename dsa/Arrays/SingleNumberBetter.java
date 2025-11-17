import java.util.Scanner;
public class SingleNumberBetter {
    public static int  NumberThatAppearOnce(int arr[]){
        int max=MaximumNumber(arr);
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int i;
        for(i=0;i<count.length;i++){
            if(count[i]==1){
                break;
            }
        }
        return i;
    }
    public static int MaximumNumber(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array's size : ");
        int n=sc.nextInt();
        System.out.println("Enter elements of an array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      int number=NumberThatAppearOnce(arr);
      System.out.println("Number that appear once in an array : "+number);
    }
}
