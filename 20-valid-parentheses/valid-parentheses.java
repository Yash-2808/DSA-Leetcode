class Solution {
    public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
        
        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put(']', '[');
        bracketMap.put('}', '{');

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char topElement = stack.pop();
                char expectedOpenBracket = bracketMap.get(c);

                if (topElement != expectedOpenBracket) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
     
    }
}