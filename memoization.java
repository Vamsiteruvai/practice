
public class memoization {
    private static int knapsack(int[] values, int[] weights, int capacity, int n) {
        int[][] dp=new int[n+1][capacity+1];

       if(n==0||capacity==0){
        return 0;
       }
       
       if(weights[n-1]>capacity){
        return dp[n][capacity]=knapsack(values, weights, capacity, n-1);
       }
       else{
        return dp[n][capacity]=Math.max(knapsack(values, weights, capacity, n-1),values[n-1]+knapsack(values, weights, capacity-weights[n-1], n-1));
       }
       
    }
    public static void main(String[] args) {
        int[] values={1,4,5,7};
        int[] weights={1,3,4,5};

        int capacity=7;
        int n=values.length;
       System.out.println( knapsack(values,weights,capacity,n));
                       
    }           
}
