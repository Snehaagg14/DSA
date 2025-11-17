package Arrays;
import java.util.*;
public class Search2D {
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
        System.out.println("Enter the elements you want to search");
        int s=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(s==a[i][j]){
                    System.out.println("Element is found at "+i+" "+j);
                    return;
                }   
                
            }
        }
        
    }

}
