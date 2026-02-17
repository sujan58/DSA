class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int candie:candies){
            if(max<candie){
                max=candie;
            }
        }
        List<Boolean> list = new ArrayList<>();
        for(int candie:candies){
            if((extraCandies+candie)>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}