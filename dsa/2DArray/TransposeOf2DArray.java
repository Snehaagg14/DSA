import java.util.Scanner;
public class TransposeOf2DArray {
    public static void Transpose(int arr[][]){
        int tran[][]=new int[arr[0].length][arr.length];
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                tran[i][j]=arr[j][i];
            }
        }
        System.out.println("The transpose of array: ");
        Print(tran);
    }
    public static void Print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row of array: ");
        int r=sc.nextInt();
        System.out.println("Enter the number of column of array: ");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is: ");
        Print(arr);
        Transpose(arr);

    }
}
