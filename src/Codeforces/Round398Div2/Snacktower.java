package Codeforces.Round398Div2;

import java.util.*;

/*
*
* 767A
*
* */
class Snacktower {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }

        int[] has = new int[n];
        int next = n; // 3

        for (int i = 0; i < n; i++) {
            has[a[i]-1] = a[i];

            if ( a[i] == next )
            {
                for (int j = next-1; j >= 0; j--)
                {
                    if (has[j]==0)
                    {
                        next = j+1;
                        break;
                    }
                    System.out.print(has[j] + " ");
                }
                System.out.println();
            }
            else {
                System.out.println();
            }
        }
    }
}
