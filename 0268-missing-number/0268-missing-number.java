class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int res=0;
        for(int i=1;i<=len;i++){
            res^=i^nums[i-1];
        }
        return res;
    }
}