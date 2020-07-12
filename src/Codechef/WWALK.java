package Codechef;

import java.util.Scanner;

public class WWALK {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        for (int t_case = 0; t_case < t; t_case++) {
            int n = kb.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextLong();
            }
            for (int i = 0; i < n; i++) {
                b[i] = kb.nextLong();
            }
            long prev = 0, res = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == b[i]) {
                    if (prev == 0) {
                        res += a[i];
                    }
                }
                prev += a[i] - b[i];
            }

            System.out.println(res);
        }
    }
}
