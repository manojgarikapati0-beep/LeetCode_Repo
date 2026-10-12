class Solution {
    public static int maxFrequency(int[] nums, int k) {
        // Step 1: Sort the array
        Arrays.sort(nums);
        
        int left = 0;
        long currentSum = 0; // Use long to prevent integer overflow during sum calculations
        int maxFreq = 0;
        
        // Step 2: Use a sliding window with the right pointer
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            
            // Check if the operations needed exceed k
            // Cost formula: (target * length) - actual_sum > k
            long target = nums[right];
            long windowLength = (right - left + 1);
            
            if ((target * windowLength) - currentSum > k) {
                currentSum -= nums[left];
                left++; // Shrink the window from the left
            }
            
            // Update the maximum frequency found so far
            maxFreq = Math.max(maxFreq, right - left + 1);
        }
        
        return maxFreq;
    }
}