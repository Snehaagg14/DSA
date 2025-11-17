package Pattern;

public class Palindrome {
    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            for(int j=i;j<5;j++){
               System.out.print(" ");
            }
            for(int k=i;k>=1; k--){
            //     int n=i;
            //     do { 
                    
            //     // } while (true);
            //     if(n>1){
            //         System.out.print(n+" ");
            //         n--;
            //     }
            //     else{
            //         System.out.print(n+" ");
            //         n++;
            //     }
            // } while (n==1);
                System.out.print(k+"");
            }
            for(int k=2;k<=i;k++){
                System.out.print(k+"");
            }
            System.out.println();
        }
    }
}
