package Arrays;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[]marks=new int[4];
    System.out.println("Enter the marks of English:");
    marks[0]=sc.nextInt();
    System.out.println("Enter the marks of Physics:");
    marks[1]=sc.nextInt();
    System.out.println("Enter the marks of Chemistry:");
    marks[2]=sc.nextInt();
    System.out.println("Marks of English: "+marks[0]+"\nMarks of Physics: "+marks[1]+"\nMarks of Chemistry: "+marks[2]);
    }  
}
