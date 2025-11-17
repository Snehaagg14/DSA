import java.util.Scanner;
public class IdentityMatrix {
    public static int Identity(int arr[][]){
        int flag=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j&&arr[i][j]==1){
                    
                }
                else if(i!=j&&arr[i][j]==0){

                }
                else{
                    flag=1;
                    return flag;
                }
            }
        }
        return flag;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of square matrix: ");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int flag=Identity(arr);
        if(flag==1){
            System.out.println("The array is not a identity matrix");
        }
        else{
            System.out.println("The array is a identity matrix");
        }
    }
}
