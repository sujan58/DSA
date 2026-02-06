class Solution {
    public int findKthPositive(int[] arr, int k) {
        int itr=0;
        int val=0;
        Set<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        for(int i=1;i<=Integer.MAX_VALUE;i++){
            if(!set.contains(i)){
                itr++;
                if(itr==k){
                    val=i;
                    break;
                }
                System.out.print(i);
            }

        }
        System.out.print(" "+val);
        return val;
    }
}