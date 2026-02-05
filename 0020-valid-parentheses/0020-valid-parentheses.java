class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> hmap=
            new HashMap<>();
        hmap.put(')','(');
        hmap.put(']','[');
        hmap.put('}','{');
        
        Stack<Character> stack = new Stack<>();
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else{
                if(!stack.isEmpty()){
                char po=stack.pop();
            if(hmap.get(s.charAt(i))==po){
                    flag=true;
                    }
                    else {
                        //flag=false;
                        return false;
                    }
                }
                
                
                else{
                    //flag=false;
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}