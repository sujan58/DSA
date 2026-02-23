class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int left=0;
        // int right=nums.length-1;
        // while(left<=right){
        //     int mid=(left+right)/2;
        //     if(nums[mid]==target){
        //         //if(nums.length==1){return new int[]{0,0};}
        //         if(mid!=nums.length-1 && nums[mid+1]==target){
        //             return new int[]{mid,mid+1};
        //         }
        //         if(mid!=0 && nums[mid-1]==target) return new int[]{mid-1,mid};
        //         else{
        //             return new int[]{mid,mid};
        //         }
                
        //     }
        //     else if(nums[mid]>target){
        //         right=mid-1;
        //     }
        //     else if(nums[mid]<target){
        //         left=mid+1;
        //     }
        // }
        // return new int[]{-1,-1,};
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[j]==target && nums[i]==target){
                return new int[]{i,j};
            }
            if(nums[i]!=target){
                i++;
            }
            if(nums[j]!=target){
                j--;
            }
        }
        return new int[]{-1,-1};

    }
}