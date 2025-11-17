import java.util.Scanner;
public class SumOfDiagonals {
    public static int SumOfPrimaryDiagonal(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    sum=sum+arr[i][j];
                }
            }
        }
        return sum;
    }
    public static int SumOfSecondaryDiagonal(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i][arr.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of square matrix: ");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int psum=SumOfPrimaryDiagonal(arr);   //Primary diagonal sum
        System.out.println("The sum of primary diagonals is "+ psum);
        int ssum=SumOfSecondaryDiagonal(arr);   //Secondary diagonal sum
        System.out.println("THe sum of secondary diagonal : "+ssum);
    }
}
