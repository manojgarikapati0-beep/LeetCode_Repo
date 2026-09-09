import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Solution so = new Solution();
        int m = sc.nextInt();
        int[] nums = new int[m];
        for(int i =0;i<m;i++){
            nums[i] = sc.nextInt();
        }
        so.removeDuplicates(nums);
    }
}