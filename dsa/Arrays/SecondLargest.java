import java.util.*;
public class SecondLargest {
    public static int secondlar(int arr[]){
        int lar=Integer.MIN_VALUE;
        int secondlar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                secondlar=lar;
                lar=arr[i];
            }
            if(arr[i]<lar&&arr[i]>secondlar){
                // int temp=arr[i];
                secondlar=arr[i];
                // secondlar=temp;

                }
            }
            return secondlar;
            
        }
    
    
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array's size: ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements of an array:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int secondlar=secondlar(arr);
    System.out.println("The second largest number in array : "+secondlar );
    }   
}
