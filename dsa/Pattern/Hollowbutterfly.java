package Pattern;

public class Hollowbutterfly {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                // System.out.print("*");
                if(j==1||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            // for(int j=1;j<=(2*(4-i));j++){
            //     System.out.print(" ");
            // }
            for(int j=i;j<4;j++){
                System.out.print(" ");
                
                
            }
            for(int j=i;j<4;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }
        for(int i=0;i<4;i++){
            for(int j=3;j>=i;j--){
                // System.out.print("*");
                if(j==3||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=3;j++){
                // System.out.print("*");
                if(j==3||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       
    }
    
}
