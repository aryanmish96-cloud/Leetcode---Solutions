import java.util.Arrays;

class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        int n = firstList.length;
        int m = secondList.length;

        int[][] result = new int[n + m][2];

        int i = 0;
        int j = 0;
        int index = 0;

        while (i < n && j < m) {

            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);

            // Intersection exists
            if (start <= end) {
                result[index][0] = start;
                result[index][1] = end;
                index++;
            }

            // Move the interval that ends first
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(result, index);
    }
}