class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long totalHours = calculateHours(piles, mid);

            if (totalHours <= h) {
                // This speed works, but try to find a smaller one
                high = mid - 1;
            } else {
                // Speed is too slow
                low = mid + 1;
            }
        }

        return low;
    }

    private long calculateHours(int[] piles, int speed) {
        long hours = 0;

        for (int pile : piles) {
            hours += (pile + speed - 1L) / speed;
        }

        return hours;
    }
}