class Solution {
    public boolean isAnagram(String s, String t) {
        int slen=s.length();
        int tlen=t.length();
        if(slen!=tlen) return false;
        // char[] sarr=s.toCharArray();
        // char[] tarr=t.toCharArray();
        // Arrays.sort(sarr);
        // Arrays.sort(tarr);
        // if(Arrays.compare(sarr,tarr)==0){
        //     return true;
        // }
        // return false;
        // HashMap<Character,Integer> smap = new HashMap<Character,Integer>();
        // HashMap<Character,Integer> tmap= new HashMap<>();
        // for(int i=0;i<slen;i++){
        //     smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
        // }
        // for(int i=0;i<slen;i++){
        //     tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
        // }
        // System.out.println(smap);
        // System.out.println(tmap);
        // for(int i=0;i<slen;i++){
        //     if(!smap.get(s.charAt(i)).equals(tmap.get(s.charAt(i)))){
        //         return false;
        //     }
        // }
        // return true;
        int[] freq = new int[26];
        for(int i=0;i<slen;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<slen;i++){
            freq[t.charAt(i)-'a']--;
        }
        for(int i:freq){
            if(i!=0) return false;
        }
        return true;
    }
}