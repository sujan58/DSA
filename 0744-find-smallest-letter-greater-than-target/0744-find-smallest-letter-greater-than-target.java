class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // int j=letters.length();
        // int i=0;
        // while(i<)
        
        // int[] arr = new int[26];
        // for(int i=0;i<letters.length;i++){
        //     arr[letters[i]-'a']++;
        //     System.out.println(letters[i]-'a');
        // }
        // for(int i=(target-'a')+1;i<26;i++){
        //     if(arr[i]>0){
        //         return (char)(i+'a');
        //     }
        // }
        // return letters[0];
        for(int i=0;i<letters.length;i++){
            if(target<letters[i]) return letters[i];
        }
        return letters[0];
    }
}