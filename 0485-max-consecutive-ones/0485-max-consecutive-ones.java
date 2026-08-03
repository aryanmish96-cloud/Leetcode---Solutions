class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int start = 0;  
        
        while (start < nums.length) {
            
            while (start < nums.length && nums[start] == 0) {
                start++;
            }
            int end = start;
            while (end < nums.length && nums[end] == 1) {
                end++;
            }
            
            
            maxCount = Math.max(maxCount, end - start);
        
            start = end;
        }
        
        return maxCount;
    }
}
