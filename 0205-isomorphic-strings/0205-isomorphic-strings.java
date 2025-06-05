class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap<Character, Integer> schar=new HashMap<>();
        HashMap<Character, Integer> tchar=new HashMap<>();

        for(int i=0; i<s.length();i++){
            if(!schar.containsKey(s.charAt(i))){
                schar.put(s.charAt(i),i);
            }
            if(!tchar.containsKey(t.charAt(i))){
                tchar.put(t.charAt(i),i);
            }
            if(!schar.get(s.charAt(i)).equals(tchar.get(t.charAt(i)))){
                return false;
            }
            
        } 
        return true;
    }
}