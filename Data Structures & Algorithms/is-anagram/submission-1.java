class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> map = new HashMap<>();
        for(char v : s.toCharArray()){
            map.put(v,map.getOrDefault(v,0)+1);
        }

         for(char v : t.toCharArray()){
            map.put(v,map.getOrDefault(v,0)-1);
        }

        for (int val : map.values()) {
            if (val != 0) return false;
        }
        return true;
    }
}
