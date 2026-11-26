class Solution {
    public int numEnclaves(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // DFS from the left and right boundaries
        for (int r = 0; r < rows; r++) {
            dfs(grid, r, 0);
            dfs(grid, r, cols - 1);
        }

        // DFS from the top and bottom boundaries
        for (int c = 0; c < cols; c++) {
            dfs(grid, 0, c);
            dfs(grid, rows - 1, c);
        }

        // Count land cells not reached from any boundary
        int count = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(int[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Stop if outside the grid or not unvisited land
        if (r < 0 || r >= rows || c < 0 || c >= cols ||
            grid[r][c] != 1) {
            return;
        }

        grid[r][c] = -1; // mark as visited

        // Visit the four neighbouring cells
        dfs(grid, r - 1, c); // up
        dfs(grid, r + 1, c); // down
        dfs(grid, r, c - 1); // left
        dfs(grid, r, c + 1); // right
    }
}