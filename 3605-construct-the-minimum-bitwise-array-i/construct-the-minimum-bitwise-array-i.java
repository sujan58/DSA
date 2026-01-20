class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int len=nums.size();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=check(arr[i],nums.get(i));
        }
        return arr;

    }
    public int check(int count,int target){
        while(count<target){
            //System.out.println(count);
            if((count|(count+1))==target){
                //System.out.println(count+" "+ count+1);
                return count;
            }
            count++;
        }
        return -1;
    }
}