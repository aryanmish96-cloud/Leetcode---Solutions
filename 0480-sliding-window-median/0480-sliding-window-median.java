import java.util.*;

class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        DualHeap dh = new DualHeap(k);
        double[] ans = new double[nums.length - k + 1];

        for (int i = 0; i < k; i++) {
            dh.add(nums[i]);
        }

        ans[0] = dh.getMedian();

        for (int i = k; i < nums.length; i++) {
            dh.add(nums[i]);
            dh.remove(nums[i - k]);
            ans[i - k + 1] = dh.getMedian();
        }

        return ans;
    }

    static class DualHeap {
        PriorityQueue<Integer> small;
        PriorityQueue<Integer> large;
        Map<Integer, Integer> delayed;
        int smallSize;
        int largeSize;
        int k;

        DualHeap(int k) {
            this.k = k;
            small = new PriorityQueue<>(Collections.reverseOrder());
            large = new PriorityQueue<>();
            delayed = new HashMap<>();
        }

        void add(int num) {
            if (small.isEmpty() || num <= small.peek()) {
                small.offer(num);
                smallSize++;
            } else {
                large.offer(num);
                largeSize++;
            }

            balance();
        }

        void remove(int num) {
            delayed.put(num, delayed.getOrDefault(num, 0) + 1);

            if (num <= small.peek()) {
                smallSize--;

                if (num == small.peek()) {
                    prune(small);
                }
            } else {
                largeSize--;

                if (!large.isEmpty() && num == large.peek()) {
                    prune(large);
                }
            }

            balance();
        }

        double getMedian() {
            if (k % 2 == 1) {
                return small.peek();
            }

            return ((long) small.peek() + large.peek()) / 2.0;
        }

        void balance() {
            if (smallSize > largeSize + 1) {
                large.offer(small.poll());
                smallSize--;
                largeSize++;
                prune(small);
            } else if (smallSize < largeSize) {
                small.offer(large.poll());
                smallSize++;
                largeSize--;
                prune(large);
            }
        }

        void prune(PriorityQueue<Integer> heap) {
            while (!heap.isEmpty()) {
                int num = heap.peek();

                if (!delayed.containsKey(num)) {
                    break;
                }

                int count = delayed.get(num);

                if (count == 1) {
                    delayed.remove(num);
                } else {
                    delayed.put(num, count - 1);
                }

                heap.poll();
            }
        }
    }
}