class Solution {
    public boolean isValid(String s) {
        if (s.length() < 2){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()){
            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                default:
                    if (stack.isEmpty() || stack.pop() != c) {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}