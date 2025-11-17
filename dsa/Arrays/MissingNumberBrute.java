
import java.util.Scanner;
public class MissingNumberBrute {
    public static int MissedElement(int arr[]){
        int flag=-1;
        for(int i=1;i<arr.length+1;i++){
            int j;
          for( j=0;j<arr.length;j++){
            if(arr[j]==i){
                break;
            }
          }
            if(j==arr.length){
               flag=i;
               break;
            }
            
          
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first array's size: ");
        int n=sc.nextInt();
        System.out.println("Enter elements of first array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int num=MissedElement(arr);
       System.out.println("The missing element is "+num);
    }
}
