import java.util.*;

class Solution {
    static class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int numEnclaves(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        Queue<Pair> queue = new ArrayDeque<>();

        // Add boundary land cells to the queue
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                boolean isBoundary =
                    row == 0 || row == rows - 1 ||
                    col == 0 || col == columns - 1;

                if (isBoundary && grid[row][col] == 1) {
                    grid[row][col] = -1; // Mark as visited
                    queue.add(new Pair(row, col));
                }
            }
        }

        // BFS: visit all land connected to the boundary
        while (!queue.isEmpty()) {
            Pair current = queue.remove();
            int row = current.row;
            int col = current.col;

            // Left
            if (col - 1 >= 0 && grid[row][col - 1] == 1) {
                grid[row][col - 1] = -1;
                queue.add(new Pair(row, col - 1));
            }

            // Right
            if (col + 1 < columns && grid[row][col + 1] == 1) {
                grid[row][col + 1] = -1;
                queue.add(new Pair(row, col + 1));
            }

            // Up
            if (row - 1 >= 0 && grid[row - 1][col] == 1) {
                grid[row - 1][col] = -1;
                queue.add(new Pair(row - 1, col));
            }

            // Down
            if (row + 1 < rows && grid[row + 1][col] == 1) {
                grid[row + 1][col] = -1;
                queue.add(new Pair(row + 1, col));
            }
        }

        // Count land cells not connected to the boundary
        int enclaveCount = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if (grid[row][col] == 1) {
                    enclaveCount++;
                }
            }
        }

        return enclaveCount;
    }
}