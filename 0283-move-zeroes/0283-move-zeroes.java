class Solution {
    public void moveZeroes(int[] nums) {
        int zc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zc=i;
                break;
            }
        }
        if(nums[zc]!=0) return;
        for(int i=zc+1;i<nums.length;i++){
            if(nums[i]!=0){
                nums[zc]=nums[i];
                nums[i]=0;
                zc++;
            }

        }
        
    }
}