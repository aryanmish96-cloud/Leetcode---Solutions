import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        Queue<Integer> queue = new ArrayDeque<>();

        for (int city = 0; city < n; city++) {
            if (visited[city]) {
                continue;
            }

            provinces++;
            visited[city] = true;
            queue.offer(city);

            while (!queue.isEmpty()) {
                int current = queue.poll();

                for (int neighbor = 0; neighbor < n; neighbor++) {
                    if (isConnected[current][neighbor] == 1
                            && !visited[neighbor]) {

                        visited[neighbor] = true;
                        queue.offer(neighbor);
                    }
                }
            }
        }

        return provinces;
    }
}