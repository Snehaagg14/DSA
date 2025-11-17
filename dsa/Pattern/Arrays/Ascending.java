package Arrays;
import java.util.*;
public class Ascending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of an array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of an array:");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b=0;
        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){
                b=1;
            }
        }
        if(b==1){
            System.out.println("An array is not sorted in ascending order.");
        }
        else{
            System.out.println("An array is sorted in ascending order.");
        }
    }
}
