class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // Compare current element with the next element (using modulo for circular comparison)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        
        // A valid rotated sorted array has at most 1 drop point
        return count <= 1;
    }
}