class Solution {
    public int countGroups(int[] position, int[] speed, int distance) {
        int n = position.length;
        Object[] x = {position, speed, distance}; 
        int groups = 1;
        int groupSpeed = speed[n-1];
        for(int i =n-2; i>=0 ; i--){
            long gap = (long) position[i+1]-position[i];
            if(gap<=distance){
                continue;
            }
            if(speed[i]>groupSpeed){
                continue;
            }
            groups++;
            groupSpeed = speed[i];
        }
        return groups;
    }
}