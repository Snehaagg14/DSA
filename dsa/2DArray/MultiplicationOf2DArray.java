import java.util.Scanner;
public class MultiplicationOf2DArray {
    public static void Multiply(int arr1[][],int arr2[][]){
        int mul[][]=new int[arr1.length][arr2[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                int sum=0;
                for(int k=0;k<arr2.length;k++){
                    sum=sum+arr1[i][k]*arr2[k][j];
                }
                mul[i][j]=sum;
            }
        }
        System.out.println("The multiplication of 2 array: ");
        Print(mul);
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
        System.out.println("Enter number of rows of first array: ");
        int r1=sc.nextInt();
        System.out.println("Enter number of column of first array: ");
        int c1=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        System.out.println("Enter elements of first array: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int r2=c1;
        System.out.println("Enter number of column of second array: ");
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
        System.out.println("Enter elements of second array: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("The first array: ");
        Print(arr1);
        System.out.println("The second array: ");
        Print(arr2);
        Multiply(arr1, arr2);
    }
}
