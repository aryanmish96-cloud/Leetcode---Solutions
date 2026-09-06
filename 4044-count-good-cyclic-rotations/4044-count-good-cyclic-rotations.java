class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int half = n/2;
        int [] arr = nums;
        long total = 0;
        for(int x : nums){
            total+=x;
        }
        long firstHalf = 0;
        for(int i = 0 ; i< half; i++){
            firstHalf += nums[i]; 
        }
        int count = 0;
        for(int start = 0 ; start<n ; start++){
            long second = total - firstHalf;
            if(firstHalf>second ){
                count++;
            }
            firstHalf -= nums[start];
            firstHalf += nums[(start+half)%n];
        }
        return count;
    }
}