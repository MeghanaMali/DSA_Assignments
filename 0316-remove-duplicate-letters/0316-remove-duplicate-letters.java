class Solution {
    public String removeDuplicateLetters(String s) {
        HashSet<Character> set=new HashSet<>();
        for(char c: s.toCharArray()){
            set.add(c);
        }
        StringBuilder str=new StringBuilder();
        for(char c:set){
          str.append(c);
        }
        return str.toString();
    }
}