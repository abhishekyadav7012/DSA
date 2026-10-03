public class Solution {
    public int longestValidParentheses(String s) {
        // Initialize a stack with -1 to handle edge case when the valid parentheses start at index 0
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);  // Base for valid parentheses
        
        int maxLength = 0;  // To keep track of the maximum length of valid parentheses
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                // Push the index of the opening parenthesis onto the stack
                stack.push(i);
            } else {
                // Pop the index of the last unmatched opening parenthesis
                stack.pop();
                
                if (stack.isEmpty()) {
                  
                    stack.push(i);
                } else {
                    
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        
        return maxLength;
    }
}