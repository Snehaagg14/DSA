package Pattern;
class Halfpyramid{
    public static void main(String args[]){
       // System.out.println("Hello World");
       //method 1 using print
       //System.out.print("*\n**\n***\n****");
       //method 2 using println
       //System.out.println("*");
       //System.out.println("**");
       //System.out.println("***");
       //System.out.println("****");
       //method 3 using for loop
       for(int i=0;i<4;i++){
        for(int j=0;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
       }

    }
}