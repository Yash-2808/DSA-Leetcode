class Solution {
    public String longestCommonPrefix(String[] strs) {
       if(strs==null || strs.length==0) return "";
       Arrays.sort(strs);
       String pref=strs[0];
       String suff=strs[strs.length-1];

       int i=0;

       while(i<pref.length() && i<suff.length() && pref.charAt(i)==suff.charAt(i)){
        i++;
       }

       return pref.substring(0,i);
    }
}