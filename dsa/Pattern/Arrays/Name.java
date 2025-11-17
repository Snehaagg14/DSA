package Arrays;
import java.util.*;
public class Name {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of an array:");
    int n=sc.nextInt();
    String names[]=new String[n];
    System.out.println("Enter an array:");
    sc.nextLine();
    for(int i=0;i<n;i++){
        names[i]=sc.nextLine();
    }
    System.out.print("The array is: {");
    for(int i=0;i<n;i++){
        System.out.print(names[i]+",");
    }
    System.out.print("}");
}
}
