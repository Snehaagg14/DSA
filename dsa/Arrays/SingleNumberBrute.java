import java.util.Scanner;
public class SingleNumberBrute {
    public static int NumberThatAppearOnce(int arr[]){
        int i;
        for(i=0;i<arr.length;i++){
          int count =0;
          for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
            }
          }
          if(count==1){
            // return arr[i];
            break;
          }
        }
        return arr[i];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n=sc.nextInt();
        System.out.println("Enter elements of an array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int number=NumberThatAppearOnce(arr);
         System.out.println("The nmber that appear once in an array: "+number);
    }
}
