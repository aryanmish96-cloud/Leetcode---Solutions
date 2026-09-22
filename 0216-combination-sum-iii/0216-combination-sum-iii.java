import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        solve(1, k, n, current, ans);

        return ans;
    }

    private void solve(
        int start,
        int k,
        int target,
        List<Integer> current,
        List<List<Integer>> ans
    ) {
        // Required k numbers have been selected
        if (current.size() == k) {
            if (target == 0) {
                ans.add(new ArrayList<>(current));
            }
            return;
        }

        // Try every number from start to 9
        for (int num = start; num <= 9; num++) {

            if (num > target) {
                break;
            }

            // Select current number
            current.add(num);

            // Select next number from num + 1
            solve(num + 1, k, target - num, current, ans);

            // Backtrack: remove selected number
            current.remove(current.size() - 1);
        }
    }
}