package Codechef;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CHFNSWPS {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        StringBuilder res = new StringBuilder();
        int t = kb.nextInt(), temp = 0;
        for (int c = 0; c < t; c++) {
            int flag = 0;
            int n = kb.nextInt();
            HashMap<Integer, Integer> aCount = new HashMap<>();
            HashMap<Integer, Integer> bCount = new HashMap<>();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                temp = kb.nextInt();
                a[i] = temp;
                if (aCount.containsKey(temp)) {
                    aCount.put(temp, aCount.get(temp)+1);
                } else {
                    aCount.put(temp, 1);
                }
            }

            for (int i = 0; i < n; i++) {
                temp = kb.nextInt();
                b[i] = temp;
                if (bCount.containsKey(temp)) {
                    bCount.put(temp, bCount.get(temp)+1);
                } else {
                    bCount.put(temp, 1);
                }
            }

            if (aCount.size() != bCount.size()) {
                res.append(-1).append('\n');
                continue;
            }

            Arrays.sort(a);
            Arrays.sort(b);

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (aCount.get(a[i]) + bCount.getOrDefault(a[i], 0) % 2 != 0) {
                    res.append(-1).append('\n');
                    flag = -1;
                    break;
                }

                if (bCount.get(b[i]) + aCount.getOrDefault(b[i], 0) % 2 != 0) {
                    res.append(-1).append('\n');
                    flag = -1;
                    break;
                }

                if (a[i] != b[i]) {
                    count++;
                }
            }
            if (flag == -1) {
                continue;
            }

            res.append(count/2).append('\n');
        }
        System.out.print(res);
    }
}
