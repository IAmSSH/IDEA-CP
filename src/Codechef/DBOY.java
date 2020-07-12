package Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class DBOY {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        for ( int testCase = 0; testCase < t; testCase++ ) {
            int n = kb.nextInt();
            int[] orders = new int[n];
            int[] stations = new int[n];
            for (int i = 0; i < n; i++) orders[i] = kb.nextInt()*2;
            for (int i = 0; i < n; i++) stations[i] = kb.nextInt();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (orders[i] > max) max = orders[i];
            }
            int[] dp = new int[max+1];
            Arrays.fill(dp, -1);
            dp[0] = 0;
            for (int i = 1; i < dp.length; i++) {
                int min = Integer.MAX_VALUE;
                for (int station : stations) {
                    if (i - station >= 0 && dp[i - station] != -1 && dp[i - station] < min) {
                        min = dp[i - station] + 1;
                    }
                    dp[i] = min == Integer.MAX_VALUE ? -1 : min;
                }
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += dp[orders[i]];
            }
            System.out.println(sum);
        }
    }
}
