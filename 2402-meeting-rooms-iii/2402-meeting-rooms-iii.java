import java.util.*;

class Solution {
    public int mostBooked(int n, int[][] meetings) {

        // Sort meetings by start time
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        // Free rooms: smallest room number first
        PriorityQueue<Integer> availableRooms = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            availableRooms.offer(i);
        }

        // Busy rooms: {endTime, roomNumber}
        PriorityQueue<long[]> busyRooms = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] == b[0]) {
                    return Long.compare(a[1], b[1]);
                }
                return Long.compare(a[0], b[0]);
            }
        );

        int[] count = new int[n];

        for (int[] meeting : meetings) {

            long start = meeting[0];
            long end = meeting[1];
            long duration = end - start;

            // Free all rooms that are done before this meeting starts
            while (!busyRooms.isEmpty()
                    && busyRooms.peek()[0] <= start) {

                int room = (int) busyRooms.poll()[1];
                availableRooms.offer(room);
            }

            int room;
            long newEnd;

            // Case 1: Some room is free
            if (!availableRooms.isEmpty()) {

                room = availableRooms.poll();
                newEnd = end;

            } else {

                // Case 2: All rooms are busy
                long[] earliest = busyRooms.poll();

                long earliestEnd = earliest[0];
                room = (int) earliest[1];

                // Delay meeting but keep same duration
                newEnd = earliestEnd + duration;
            }

            count[room]++;

            busyRooms.offer(new long[]{newEnd, room});
        }

        // Find room with maximum meetings
        int answer = 0;

        for (int i = 1; i < n; i++) {
            if (count[i] > count[answer]) {
                answer = i;
            }
        }

        return answer;
    }
}