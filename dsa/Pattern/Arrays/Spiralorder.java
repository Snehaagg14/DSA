package Arrays;
import java.util.*;
public class Spiralorder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r=sc.nextInt();
        System.out.println("Enter number of columns:");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter elements of an 2D array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int rs=0;
        int re=r-1;
        int cs=0;
        int ce=c-1;
        while(rs<=re&&cs<=ce){
            for(int col=cs;col<=ce;col++){
                System.out.print(a[rs][col]+" ");
            }
            rs++;
            // System.out.println();
            for(int row=rs;row<=re;row++){
                System.out.print(a[row][ce]+" ");
            }
            ce--;
            // System.out.println();
            for(int col=ce;col>=cs;col--){
                System.out.print(a[re][col]+" ");
            }
            re--;
            // System.out.println();
            for(int row=re;row>=rs;row--){
                System.out.print(a[row][cs]+" ");
            }
            cs++;
            System.out.println();
        }
    }

}
