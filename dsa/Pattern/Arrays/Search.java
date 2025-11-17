package Arrays;
import java.util.*;
public class Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of an array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element you want to find: ");
        int x=sc.nextInt();
        int f=-1;
        for(int i=0;i<n;i++){
            if(a[i]==x){
            
                System.out.println(x+" is found at "+i );
                return;
            }
        //     else{
        //         System.out.println(x+" is not found.");
        //     }
        // }
        // if(f>=0){
        //     System.out.println(x+" is found at "+f );
        // }
        // else{
        //          System.out.println(x+" is not found.");
        //      }
    }
    
    }
}

    
