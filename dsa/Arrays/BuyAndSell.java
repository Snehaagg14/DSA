import java.util.*;
public class BuyAndSell {
//     public static void profit(int arr[]){
//         int buy[]=new int[arr.length];
//         buy[0]=arr[0];
//         for(int i=1;i<arr.length;i++){
//             buy[i]=Math.min(arr[i],buy[i-1]);
//         }
//         int mp=Integer.MIN_VALUE;   //maximum profit
//         int day=0;
//         for(int i=0;i<arr.length;i++){
//             if(buy[i]<arr[i]){
//             int cp=arr[i]-buy[i];
//              if(cp>mp){
//             mp=cp;
//             day=i+1;
            
//         }
//         }
//     }
//         System.out.println("The maximum profit that we can get is of "+ mp +" on "+day);
//     }
    public static void profit2(int arr[]){
       int maxprofit=0;
       int buyprice=Integer.MAX_VALUE;
       int profit;
       int bd=1;
       int sd=0;
       for(int i=0;i<arr.length;i++){
        if(buyprice>arr[i]){
           buyprice=arr[i];
           bd=i+1;
        }
        else if(buyprice<arr[i]){
        profit=arr[i]-buyprice;
        if(maxprofit<profit){
            maxprofit=profit;
            sd=i+1;
        }
        // maxprofit=Math.max(profit, maxprofit);
       }
    }
       System.out.println("The maximum profit is "+ maxprofit);
       System.out.println("The day of buying is "+ bd);
       System.out.println("The day of selling is "+ sd);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the rate of stock: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        profit2(arr);

    }
}
