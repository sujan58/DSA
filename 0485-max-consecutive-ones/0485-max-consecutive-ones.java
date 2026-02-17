class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==1 && nums[0]==1){
            return 1;
        }
        int i=0;
        int count=0;
        int curr=0;
        // for(int k=0;k<nums.length;k++){
        //     if(nums[k]==1){
        //         i=k;
        //         curr=1;
        //         break;
        //     }
        // }
        //int j=i+1;
        int j=0;
        while(j!=nums.length){
            if(nums[j]==1){
                curr++;
                // System.out.println(curr);
            }
            else{
                count=Math.max(curr,count);
                curr=0;
            }
            count=Math.max(curr,count);
            j++;
        }
        return count;
    }
}