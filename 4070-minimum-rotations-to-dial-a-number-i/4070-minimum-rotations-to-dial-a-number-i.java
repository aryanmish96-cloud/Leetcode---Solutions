class Solution {
    public int minRotations(String s) {
        int ans =0 , prev = 0;
        for(char c : s.toCharArray()){
            int cur = c - '0';
            int diff = Math.abs(cur-prev);
            ans+=Math.min(diff,10-diff);
            prev = cur;
        }
        return ans ;
    }
}