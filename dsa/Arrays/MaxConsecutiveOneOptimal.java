import java.util.Scanner;
public class MaxConsecutiveOneOptimal {
    public static int MaximumConsecutiveOne(int arr[]){
        int max=0;
        int currcount=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]==1){
          currcount=currcount+1;
        }
        else{
            currcount=0;
        }
        max=Math.max(max, currcount);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int n=sc.nextInt();
        System.out.println("Enter elemens of an array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      int maxcount=MaximumConsecutiveOne(arr);
      System.out.println("The maximun consecutive one: "+maxcount);
    }
}
