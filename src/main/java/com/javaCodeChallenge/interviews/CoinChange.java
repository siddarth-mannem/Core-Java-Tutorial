package com.javaCodeChallenge.interviews;

/***
 * //You are given coins of different denominations and a total amount of money amount. 
Write a function to compute the fewest number of coins that you need to make up that amount. 
If that amount of money cannot be made up by any combination of the coins, return -1.

Example 1:
coins = [1, 2, 5], amount = 11
return 3 (11 = 5 + 5 + 1)

Example 2:
coins = [2], amount = 3
return -1.

Note:
You may assume that you have an infinite number of each kind of coin.
 * 
 * @author siddharth
 * @Created Nov 10, 2020
 *
 */
public class CoinChange {

    public static void main(String args[]) 
    { 
       int coins[] =  {9, 6, 5, 1}; 
       int m = coins.length; 
       int V = 9;
       System.out.println("Minimum coins required is "+ minCoins(coins, m, V) ); 
    } 
    
	// m is size of coins array (number of different coins) 
    static int minCoins(int coins[], int totalCoins, int amount) 
    { 
       // base case 
       if (amount == 0) return 0; 
       
       // Initialize result 
       int res = Integer.MAX_VALUE; 
       
       // Try every coin that has smaller value than amount
       for (int i=0; i<totalCoins; i++) 
       { 
         if (coins[i] <= amount) 
         { 
             int sub_res = minCoins(coins, totalCoins, amount-coins[i]); 
       
             // Check for INT_MAX to avoid overflow and see if 
             // result can minimized 
             if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res) {
            	 res = sub_res + 1; 
             }
                 
         } 
       } 
       return res; 
    } 

	
    public static int coinChange(int[] coins, int amount) {
        if(amount < 1) {
            return 0;
        }
        
        return coinChangeRecursive(coins, amount, new int[amount]);
    }
    
    public static int coinChangeRecursive(int[] coins, int amount, int[] dp) {
        if(amount < 0) {
            return -1;
        }
        if(amount == 0) {
            return 0;
        }
        if(dp[amount - 1] != 0) {
            return dp[amount - 1];
        }
        
        int min = Integer.MAX_VALUE;
        for(int coin: coins) {
            int result = coinChangeRecursive(coins, amount - coin, dp);
            if(result >= 0 && result < min) {
                min = 1 + result;
            }
        }
        
        dp[amount - 1] = min == Integer.MAX_VALUE ? -1 : min;
        return dp[amount - 1];
    }
    
    public class Sum {
    	
    }

}
