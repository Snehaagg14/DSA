package Pattern;

public class Traingle01 {
    public static void main(String[] args) {
        int n=0;
        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                //method 1
        //         if(n==1){

        //     System.out.print(n+" ");
        //     n--;
        //     }
        //     else{
            
        //     System.out.print(n+" ");
        //     n++;
        //    }
        //method 2
        if(((i+j)%2)==0){
            System.out.print("1 ");
        }
        else{
            System.out.print("0 ");
        }
        }
            System.out.println();
           }
 
}
}
