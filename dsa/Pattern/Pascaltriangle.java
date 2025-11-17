package Pattern;

public class Pascaltriangle {
    public static void main(String[] args) { 
        int c=1;
           for(int i=0;i<5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(i==0||j==0){
                // System.out.print(1+" ");
                c=1;
                }
        
            
                else{
                     c = c*(i-j+1)/j;
                }
                    System.out.print(c+ " ");
                
            }

            System.out.println();
           }
    }
    
}
