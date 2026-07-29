import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] answer = new int[n - k + 1];

        // Stores indices, not values
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // 1. Remove index that is outside the current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // 2. Remove smaller or equal elements from the back
            while (!deque.isEmpty()
                    && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // 3. Add current index
            deque.offerLast(i);

            // 4. Store maximum once the first window is complete
            if (i >= k - 1) {
                answer[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return answer;
    }
}