import java.util.Scanner;
public class SingleNumberOptimal {
    public static int NumberThatAppearOnce(int arr[]){
        int num=0;
        for(int i=0;i<arr.length;i++){
            num^=arr[i];
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int n=sc.nextInt();
        System.out.println("Enter elements of an array:  ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int number=NumberThatAppearOnce(arr);
        System.out.println("Number that appear once in an array: "+number);
    }
}
