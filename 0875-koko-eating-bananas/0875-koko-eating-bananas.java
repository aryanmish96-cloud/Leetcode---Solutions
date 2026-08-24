class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int high = 0;
        int ans = -1;
        for(int num : piles){
            high = Math.max(num,high);
        }
        while(start<=high){
            int mid = start+(high-start)/2;
            if(isPossible(piles , mid , h)){
            
                high = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }

    public boolean isPossible(int []piles , int speed , int h){
        long totalHours = 0;
        for(int num : piles){
            totalHours +=(long)Math.ceil((double)num/speed);
        
        if(totalHours>h){
            return false;
        }
        }
        return true ;
}
    }
    