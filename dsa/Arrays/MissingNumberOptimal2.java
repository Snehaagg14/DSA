import java.util.Scanner;
public class MissingNumberOptimal2 {
    public static int MissedNumber(int arr[]){
        int xor1=0;
        int xor2=0;
        for(int i=1;i<=arr.length+1;i++){
            xor1=xor1^i;
        }
        for(int i=0;i<arr.length;i++){
            xor2=xor2^arr[i];
        }
       int num=xor1^xor2; 
       return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int n= sc.nextInt();
        System.out.println("Enter elements of an array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num=MissedNumber(arr);
        System.out.println("Missed number in an array: "+num);

    }
}
