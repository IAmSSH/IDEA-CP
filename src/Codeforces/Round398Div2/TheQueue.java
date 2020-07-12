package Codeforces.Round398Div2;
/*
 * 767B
 * */
import java.util.Scanner;

public class TheQueue {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double ts, tf, t, wait = -1;
        ts = kb.nextDouble();
        tf = kb.nextDouble();
        t = kb.nextDouble();

        int n = kb.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextDouble();
        }

        double total = n*t;

        if ( total+t < (tf-ts) )
        {
            wait = 0;
        }

        if ( wait == -1 )
        {
            double curr_min = (ts - (arr[0]-1) >= 0) ? (ts - (arr[0]-1)) : Integer.MAX_VALUE;

            for (int j = 0; j < n-1; j++) {
                if (arr[j]+1 != arr[j+1])
                {
                    if (arr[j+1] >= ts)
                    {
                        curr_min = Math.min( curr_min, (j+1)*t );
                    }
                    else
                    {
                        curr_min = Math.min( curr_min, Math.abs( ts-( arr[j+1]-1 ) ) + ((j+1)*t) );
                    }
                }
            }
            System.out.println(curr_min);

        }
        else
        {
            System.out.println(wait);
        }
    }
}
