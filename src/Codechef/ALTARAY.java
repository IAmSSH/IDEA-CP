package Codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class ALTARAY {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        for (int cases = 0; cases < t; cases++) {
            int n = kb.nextInt();
            int[] arr = new int [n];
            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            int cnt = 1;
            int[] cntArr = new int[n];
            cntArr[n-1] = 1;
            for (int i = n-2; i >= 0; i--) {
                if (isAlt(arr, i)) {
                    cnt++;
                }
                else {
                    cnt = 1;
                }
                cntArr[i] = cnt;
            }
            for (int ele : cntArr) System.out.print(ele + " ");
            System.out.println();
        }
    }

    private static boolean isAlt(int[] arr, int i) {
        return ( (arr[i] < 0) && (arr[i + 1] > 0) ) ||
                ( (arr[i] > 0) && (arr[i + 1] < 0) );
    }
}
