class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Solve(nums , 0 , current , ans );
        return ans ;
    }
    public void Solve(int[]arr , int i , List<Integer> current , List<List<Integer>>ans){
        if(i==arr.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[i]);
        Solve(arr , i+1 , current , ans);
        current.remove(current.size()-1);
        while(i+1<arr.length && arr[i]== arr[i+1]){
            i++;
        }
         Solve(arr , i+1 , current , ans);
    }
}