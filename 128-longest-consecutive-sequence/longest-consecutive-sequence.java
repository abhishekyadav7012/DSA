class Solution {
    public int longestConsecutive(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for(int num:nums){
                set.add(num);
            }
            int maxlen = 0;
            int current = 0;
            int length=0;
            for(int num:set){
                if(!set.contains(num-1)){
                        current = num;
                       length =1;
                }
                while(set.contains(current+1)){
                    current++;
                    length++;

                }
                 maxlen = Math.max(maxlen,length);
            }

           return maxlen;


    }
}