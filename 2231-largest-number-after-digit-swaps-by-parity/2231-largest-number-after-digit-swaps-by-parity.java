import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int largestInteger(int num) {

        char[] digits = String.valueOf(num).toCharArray();

        PriorityQueue<Integer> evenHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        PriorityQueue<Integer> oddHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        // Step 1: Add digits to their respective max heaps
        for (char ch : digits) {
            int digit = ch - '0';

            if (digit % 2 == 0) {
                evenHeap.offer(digit);
            } else {
                oddHeap.offer(digit);
            }
        }

        // Step 2: Create the largest possible number
        StringBuilder answer = new StringBuilder();

        for (char ch : digits) {
            int digit = ch - '0';

            if (digit % 2 == 0) {
                answer.append(evenHeap.poll());
            } else {
                answer.append(oddHeap.poll());
            }
        }

        return Integer.parseInt(answer.toString());
    }
}