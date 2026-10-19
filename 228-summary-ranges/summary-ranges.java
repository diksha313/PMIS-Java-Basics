import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < nums.length; ) {
            int j = i;

            for (; j + 1 < nums.length && nums[j + 1] == nums[j] + 1; j++) {
                // Find the end of the consecutive range
            }

            if (i == j) {
                result.add(nums[i] + "");
            } else {
                result.add(nums[i] + "->" + nums[j]);
            }

            i = j + 1;
        }

        return result;
    }
}
