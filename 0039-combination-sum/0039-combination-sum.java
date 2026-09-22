class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        solve(candidates,target,0,ans , current);
        return ans;

    }

    public void solve(int [] arr , int target , int i , List<List<Integer>> ans , List<Integer> current){
        
          if(i==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(current));
            }
            return;
          }
    if(arr[i] <= target){
        current.add(arr[i]);
        solve(arr,target-arr[i],i,ans,current);
        current.remove(current.size()-1);

    }
    solve(arr,target,i+1, ans , current);

      
    }

}