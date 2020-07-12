package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CoinChange322 {
    public static void main(String[] args) {
        class RecursiveSolution {
            public int coinChange(int[] coins, int amount) {
                int[] memo = new int[amount+1];
                int change = getChange(amount, coins, memo);
                return change;
            }

            public int getChange(int amount, int[] coins, int[] memo){
                if ( amount == 0 ) {
                    return 0;
                }
                if ( amount < 0 ) {
                    return -1;
                }
                if (memo[amount] != 0) {
                    return memo[amount];
                }
                int min = Integer.MAX_VALUE;
                for (int coin : coins) {
                    int res = getChange(amount - coin, coins, memo) + 1;
                    if (res < min && res != 0) {
                        min = res;
                    }
                }
                memo[amount] = min == Integer.MAX_VALUE ? -1 : min;
                return memo[amount];
            }
        }

        class IterativeSolution{
            public int coinChange(int[] coins, int amount) {
                int[] dp = new int[amount+1];
                Arrays.fill(dp, -1);
                dp[0] = 0;
                for (int i = 1; i < dp.length; i++) {
                    int min = Integer.MAX_VALUE;
                    for (int coin : coins) {
                        if (i - coin >= 0 && dp[i - coin] != -1 && dp[i - coin] < min) {
                            min = dp[i - coin] + 1;
                        }
                        dp[i] = min == Integer.MAX_VALUE ? -1 : min;
                    }
                }
                return dp[amount];
            }
        }

        IterativeSolution s = new IterativeSolution();
        System.out.println(s.coinChange(new int[] {2}, 3));
    }
}
