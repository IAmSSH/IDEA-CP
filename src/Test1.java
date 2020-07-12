import java.util.HashMap;

public class Test1 {
    public static int palindromicSum(int[] arr, int N, int K) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        for (int i = 0; i <= (N/2)-1; i++) {
            int sum = arr[i] + arr[N-i-1];
            if (sum <= K) {
                if (dict.containsKey(sum)) {
                    dict.put(sum, dict.get(sum)+1);
                }
                else {
                    dict.put(sum, 1);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int ele : dict.keySet()) {
            if (dict.get(ele) > max) {
                max = dict.get(ele);
            }
        }
        return (N/2)-max;
    }
    public static void main(String[] args) {
        System.out.println(palindromicSum(new int[]{16,1,7,10,5,8,20,1}, 8,18));
    }
}
