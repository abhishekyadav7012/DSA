class Solution {
    public int maxDepth(String s) {

        int depth = 0;
        int maxdepth = 0;

        for(char i : s.toCharArray()){

            if(i == '('){
                depth++;
                maxdepth = Math.max(maxdepth, depth);
            }

            else if(i == ')'){
                depth--;
            }
        }

        return maxdepth;
    }
}