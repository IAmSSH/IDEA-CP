package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3Sum_Editorial {

    public static void main(String[] args) {
        class Solution {
            public List<List<Integer>> threeSum(int[] nums) {
                List<List<Integer>> res = new ArrayList<>();
                int l, r;
                if (nums.length >= 3) {
                    Arrays.sort(nums);
                    for (int i = 0; i < nums.length-2; i++) {
                        if (nums[i] > 0)
                            break;
                        l = i+1;
                        r = nums.length-1;
                        while( l < r )
                        {
                            if ( nums[i] + nums[l] + nums[r] == 0 ) {
                                // append to res
                                res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                                while ( l<r && nums[l] == nums[l+1]) l++;
                                while (r>l && nums[r-1] == nums[r]) r--;
                                l++;
                                r--;
                            }
                            else if (nums[i] + nums[l] + nums[r] > 0) {
                                // move right
                                while (l<r && nums[r-1] == nums[r]) r--;
                                r--;
                            }
                            else {
                                // move left
                                while (l<r && nums[l] == nums[l+1]) l++;
                                l++;
                            }
                        }

                        if ( nums[i] == nums[i+1] )
                            while ( i < nums.length-2 && nums[i] == nums[i+1] ) i++;
                    }
                }
                return res;
            }
        }
        Solution s = new Solution();
        System.out.println(s.threeSum(new int[] {1,-1,-1,0}));
    }
}
