class Solution {
    public String reverseWords(String s) {
        String [] words=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String ch:words){
            StringBuilder rev=new StringBuilder(ch).reverse();
            result.append(rev).append(" ");
        }
        //result.deleteCharAt(result.length()-1);
        return result.toString().trim();
    }
}