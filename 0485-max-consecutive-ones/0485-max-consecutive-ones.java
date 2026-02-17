class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int co=0;
        int ma=0;
        for (int num:nums){
            if (num==0){
                if (ma<co){
                    ma=co;
                
                }
                co=0;
            }
                else{
                    co++;
                }
        }
        return Math.max(ma,co);
    }
}