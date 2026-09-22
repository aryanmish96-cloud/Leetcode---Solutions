class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);
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
        solve(arr,target-arr[i],i+1,ans,current);
        current.remove(current.size()-1);

    }
    while(i+1<arr.length && arr[i]==arr[i+1]){
        i++;
    }
    solve(arr,target,i+1, ans , current);

      
    }

}