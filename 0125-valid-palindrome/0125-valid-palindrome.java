class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9//s//]","").replace("/","").replace("\\","").toLowerCase();
        //System.out.println(str.toLowerCase());
        //StringBuilder sb = new StringBuilder(str.toLowerCase());
        //sb.reverse();
        //System.out.print(str.toLowerCase());
        //return str.toLowerCase().equals(sb.toString());
        boolean flag=true;
        
            int j=str.length()-1;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!=str.charAt(j)){
                    flag=false;
                    break;
                }
                j--;
            }
        return flag;
        
    }
}