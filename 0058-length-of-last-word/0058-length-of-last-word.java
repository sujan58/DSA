class Solution {
    public int lengthOfLastWord(String s) {
        // s=s.trim();
        // String[] sarr = s.split(" ");
        // for(String str:sarr){
        //     System.out.println(str);
        // }
        // return sarr[sarr.length-1].length();
        int counter=0;
        int len=s.length();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                counter=countfunc(i,len,s,count);
                break;
            }
        }
        return counter;
    }
    private int countfunc(int i,int len,String s,int count){
        System.out.println(i);
        while(i>=0 && s.charAt(i--)!=' '){
            count++;
        }
        return count;
    }
}