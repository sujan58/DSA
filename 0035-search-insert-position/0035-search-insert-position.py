class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if nums[len(nums)-1]<target:
            return len(nums)
        else:
            i=0
            while(nums[i]<target):
                i+=1
            return i
        