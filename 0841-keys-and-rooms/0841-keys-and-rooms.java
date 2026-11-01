import java.util.List;
import java.util.Queue;
import java.util.ArrayDeque;

class Solution {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Queue<Integer> queue = new ArrayDeque<>();

        // Start from room 0.
        visited[0] = true;
        queue.offer(0);

        while (!queue.isEmpty()) {
            int room = queue.poll();

            // Collect the keys inside this room.
            for (int key : rooms.get(room)) {
                if (!visited[key]) {
                    visited[key] = true;
                    queue.offer(key);
                }
            }
        }

        // Check whether every room was visited.
        for (boolean status : visited) {
            if (!status) {
                return false;
            }
        }

        return true;
    }
}