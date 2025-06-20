class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charmap=new HashMap<>();
        int left=0, maxlen=0;
        for(int right=0;right<s.length();right++){
            char current=s.charAt(right);
            if(charmap.containsKey(current) && charmap.get(current)>=left){
               left=charmap.get(current)+1;
            }
            charmap.put(current, right);
            maxlen=Math.max(maxlen, right-left+1);

        }
        return maxlen;
    }
}