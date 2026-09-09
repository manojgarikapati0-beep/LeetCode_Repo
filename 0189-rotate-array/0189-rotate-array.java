class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    private int[] reverse(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Solution so = new Solution();
        int m = sc.nextInt();
        int[] nums = new int[m];
        for(int i =0;i<m;i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        so.rotate(nums,k);
    }
}