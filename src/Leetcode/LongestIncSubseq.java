package Leetcode;

import java.util.Arrays;

public class LongestIncSubseq {
    public static void main(String[] args) {
        class Solution {
            public int lengthOfLIS(int[] nums) {
                if (nums.length > 0) {
                    int[] dp = new int[nums.length];
                    for (int i = 0; i < nums.length; i++) {
                        int jPos = -1;
                        for (int j = 0; j < i; j++) {
                            if (nums[j] < nums[i]) {
                                jPos = Math.max(dp[j],jPos);
                            }
                        }
                        if (jPos != -1) {
                            dp[i] = jPos+1;
                        }
                        else {
                            dp[i] = 1;
                        }
                    }
                    int max = Integer.MIN_VALUE;
                    for (int i = 0; i < nums.length; i++) {
                        max = Math.max(max, dp[i]);
                    }
                    Arrays.stream(dp)
                        .forEach(System.out::print);
                    return max;
                }
                return 0;
            }
        }

        System.out.println(new Solution().lengthOfLIS(new int[] {1,2,3,4}));
    }
}
