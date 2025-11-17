package Arrays;
import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r=sc.nextInt();
        System.out.println("Enter number of columns:");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter elements of an array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int t[][]=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                t[j][i]=a[i][j];
            }
        }
        System.out.println("The transpose of an array:");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
