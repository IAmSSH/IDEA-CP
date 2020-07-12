package Codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CARSELL {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();


        for (int cases = 0; cases < t; cases++) {
            ArrayList<Integer> arr = new ArrayList<>();
            int sum = 0;
            int n = kb.nextInt();
            int temp;
            for (int i = 0; i < n; i++) {
                temp = kb.nextInt();
                arr.add(temp);
            }

            Collections.sort(arr, Collections.reverseOrder());

            for (int i = 0; i < n; i++) {
                sum = arr.get(i)-i > 0 ? ( sum + ( arr.get(i)-i ) ) : sum;
            }
            double ans = sum % (Math.pow(10, 9) + 7);
            System.out.println((int)ans);
        }
    }
}