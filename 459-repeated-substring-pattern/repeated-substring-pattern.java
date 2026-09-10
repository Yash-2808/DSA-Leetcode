class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        String h=s.substring(1,n)+s.substring(0,n-1);

        return h.contains(s);

    }
}