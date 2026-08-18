class Solution {
    public int kthSmallest(int[][] matrix, int k) {
         PriorityQueue<int[]> pq =
        new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

    int n = matrix.length;

    
    for (int row = 0; row < n; row++) {
        pq.offer(new int[]{matrix[row][0], row, 0});
    }

    while (k > 1) {

        int[] curr = pq.poll();

        int row = curr[1];
        int col = curr[2];

        
        if (col + 1 < matrix[row].length) {
            pq.offer(new int[]{
                matrix[row][col + 1],
                row,
                col + 1
            });
        }

        k--;
    }

    return pq.poll()[0];
    }
}