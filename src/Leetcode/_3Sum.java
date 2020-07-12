package Leetcode;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<List<Integer>, Boolean> m = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length >= 3)
        {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length-1; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    int remaining = -( nums[i] + nums[j] );
                    if ( !(Arrays.binarySearch(nums, j+1, nums.length, remaining) < 0) ) {
                        List<Integer> temp = new ArrayList<>(Arrays.asList( nums[i], nums[j], remaining ));
                        Collections.sort(temp);
                        if (m.get(temp) == null) {
                            m.put(temp, true);
                            res.add(temp);
                        }
                    }
                }
            }
            return res;
        }
        return res;
    }
}

public class _3Sum {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.threeSum(new int[] {1, 2, -1, 0, 4, -4, -6, 8, 3, 1, -9}));
//        System.out.println(s.threeSum(new int[] {}));
    }
}
