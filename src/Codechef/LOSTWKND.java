package Codechef;

import java.util.Scanner;

public class LOSTWKND {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        for (int t_case = 0; t_case < t; t_case++) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += kb.nextInt();
            }
            int p = kb.nextInt();
            p = Math.floorDiv(120,p);
            if (sum > p)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
