class Solution {
public int kthSmallest(int[][] mat, int k) {

    int[] sums = mat[0];

    for (int r = 1; r < mat.length; r++) {
        sums = merge(sums, mat[r], k);
    }

    return sums[k-1];
}

private int[] merge(int[] a, int[] b, int k) {

    PriorityQueue<int[]> pq = new PriorityQueue<>(
        (x, y) -> Integer.compare(
            a[x[0]] + b[x[1]],
            a[y[0]] + b[y[1]]
        )
    );

    for (int i = 0; i < Math.min(a.length, k); i++) {
        pq.offer(new int[]{i, 0});
    }

    int size = Math.min(k, a.length * b.length);
    int[] result = new int[size];

    for (int x = 0; x < size; x++) {

        int[] curr = pq.poll();

        int i = curr[0];
        int j = curr[1];

        result[x] = a[i] + b[j];

        if (j + 1 < b.length) {
            pq.offer(new int[]{i, j + 1});
        }
    }

    return result ;
}
}