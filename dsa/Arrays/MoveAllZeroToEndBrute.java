import java.util.Scanner;
public class MoveAllZeroToEndBrute {
    public static void FinalArray(int arr[]){
        int n=arr.length;
      for(int i=0;i<n;i++){
          if(arr[i]==0){
            for(int j=i;j<n-1;j++){
                int temp=arr[j];
              arr[j]=arr[j+1];  
              arr[j+1]=temp;
    
            }
            n--;
          }
      }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's size:");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter elements of an array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        FinalArray(arr);
        System.out.println("Final Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
