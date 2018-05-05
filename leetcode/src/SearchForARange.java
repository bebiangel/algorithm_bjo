/**
 * https://leetcode.com/problems/search-for-a-range/description/
 */
public class SearchForARange {
    //
    public static void main(String[] args) {
        //
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
    }

    public static int[] searchRange(int[] nums, int target) {
        //
        if (nums.length == 0) return new int[]{-1, -1};
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            //
            int startValue = nums[i];
            int endValue = nums[nums.length - 1 - i];
            if (startValue == target) {
                startIndex = i;
            }
        }
        return new int[]{startIndex, endIndex};
    }
}
