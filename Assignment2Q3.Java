class Solution {
    public int findLHS(int[] nums) {
        int len = nums.length;
        int left = 0;
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            while (left < i && nums[i] - nums[left] > 1L) {
                left++;
            }
            if (nums[i] - nums[left] == 1L) {
                result = Math.max(i - left + 1, result);
            }
        }
        return result;
    }
}