class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
         solve(nums,current,result,0);
         return result;
    }
    public void solve(int[] arr , List<Integer> current , List<List<Integer>> result , int i ){
        if(i== arr.length){
          result.add(new ArrayList<>(current));
          return;
        }
        current.add(arr[i]);
        solve(arr,current,result,i+1);

        current.remove(current.size()-1);
         solve(arr,current,result,i+1);
    }
}