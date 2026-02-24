import java.util.*;

class Solution {
    public boolean equalFrequency(String word) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < word.length(); i++)
            map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);

        for (char ch : new HashSet<>(map.keySet())) {

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }

            if (allEqual(map)) return true;

            
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return false;
    }

    private boolean allEqual(Map<Character, Integer> map) {
        int freq = -1;

        for (int val : map.values()) {
            if (freq == -1) freq = val;
            else if (freq != val) return false;
        }

        return true;
    }
}