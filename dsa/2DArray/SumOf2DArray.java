import java.util.Scanner;
public class SumOf2DArray {
    public static int[][] Sum(int arr1[][],int arr2[][]){
        int sum[][]=new int[arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
              sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
    return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r=sc.nextInt();
        System.out.println("Enter number of columns: ");
        int c=sc.nextInt();
        int arr1[][]=new int[r][c];
        System.out.println("Enter the elements of first array: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int arr2[][]=new int[r][c];
        System.out.println("Enter the elements of second array: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("The sum of 2 array: ");
        int sum[][]=Sum(arr1, arr2);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(sum[i][j]+"\t");
            }
        System.out.println();    
        }
    }
    
}
