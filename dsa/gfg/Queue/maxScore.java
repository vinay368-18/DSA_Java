package gfg.Queue;

import java.util.*;

public class maxScore {
    public static void main(String[] args) {
        int[] arr = {100, -30, -50, -15, -20, -30};
        int k = 3;

        int r = getScore(arr, k);
        System.out.println(r);
    }

    static int getScore(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];

        dp[0] = arr[0];

        for (int i = 1; i < n; i++) {
            int maxPrevious = Integer.MIN_VALUE;

            for (int j = Math.max(0, i - k); j < i; j++) {
                if (dp[j] > maxPrevious) {
                    maxPrevious = dp[j];
                }
            }

            dp[i] = arr[i] + maxPrevious;
        }

        return dp[n - 1];
    }
}