class Solution {

    public int maxValue(int n, int index, int maxSum) {
        int low = 1;
        int high = maxSum;
        int answer = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long totalSum = mid;

            // Elements on the left side
            totalSum += calculateSideSum(mid - 1, index);

            // Elements on the right side
            totalSum += calculateSideSum(mid - 1, n - index - 1);

            if (totalSum <= maxSum) {
                answer = mid;      // mid is possible
                low = mid + 1;     // try a larger value
            } else {
                high = mid - 1;    // mid is too large
            }
        }

        return answer;
    }

    private long calculateSideSum(long start, int count) {

        // Enough values to decrease without reaching 1
        if (start >= count) {
            long last = start - count + 1;

            return count * (start + last) / 2;
        }

        // Values decrease until 1, then remaining positions contain 1
        long decreasingSum = start * (start + 1) / 2;
        long remainingOnes = count - start;

        return decreasingSum + remainingOnes;
    }
}