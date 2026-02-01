class Solution {
    public int singleNumber(int[] nums) {
        //arrays
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<nums.length;i+=2){
            
            if((i!=nums.length-1)){
                if((nums[i]!=nums[i+1])){
                    res=nums[i];
                    break;
                }
            }
            if(((i+1)>=nums.length)){
                res=nums[i];
                break;
            }
        }
        return res;
        //xor
        // int xor=0;
        // for(int i=0;i<nums.length;i++){
        //     xor^=nums[i];
        // }
        // return xor;

    }
}