class Solution {
    public boolean detectCapitalUse(String word) {
        String result = word.substring(0,1).toUpperCase() + 
                word.substring(1).toLowerCase();

        String st =word.toUpperCase();
        String st1 =word.toLowerCase();
        return word.equals(st)||word.equals(result)||word.equals(st1);
    }
}