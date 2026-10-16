import java.util.*;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        // Count possible starting positions
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                left[i] = i + 1;
            } else {
                left[i] = i - stack.peek();
            }

            stack.push(i);
        }

        stack.clear();

        // Count possible ending positions
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                right[i] = n - i;
            } else {
                right[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        long answer = 0;
        long mod = 1_000_000_007;

        for (int i = 0; i < n; i++) {
            long contribution = (long) arr[i] * left[i] * right[i];
            answer = (answer + contribution) % mod;
        }

        return (int) answer;
    }
}