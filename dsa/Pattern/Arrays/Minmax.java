package Arrays;
import java.util.*;
public class Minmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements pf an array");
        for(int i=0;i<n;i++){
         a[i]=sc.nextInt();
        } 
        int max=Integer.MIN_VALUE;   
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
            else if(a[i]>max){
                max=a[i];
            }

            }
            System.out.println("Maximum value in an array: "+max+"\nMinimum value in an array: "+min);
        }
        
    }

    

