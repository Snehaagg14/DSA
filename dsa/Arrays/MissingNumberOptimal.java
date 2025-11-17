import java.util.*;
public class MissingNumberOptimal {
    public static int MissedNumber(int arr[]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int num=((((n+1)*(n+2))/2)-sum);
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int n=sc.nextInt();
        System.out.println("Enter elements of an array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num=MissedNumber(arr);
        System.out.println("The missed number in an array is: "+num);
    }

}
