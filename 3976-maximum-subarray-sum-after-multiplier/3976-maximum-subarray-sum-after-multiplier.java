class Solution {
    public long maxSubarraySum(int[] nums, int k) {
         int[] mavireltho = nums;

        long multiplyCase = calculateBestSum(mavireltho, k, true);
        long divideCase = calculateBestSum(mavireltho, k, false);

        return Math.max(multiplyCase, divideCase);
    }

    private long calculateBestSum(int[] nums, int k, boolean multiplyOperation) {

        int n = nums.length;
        long negativeInfinity = Long.MIN_VALUE / 4;

        long normalSubarray = nums[0];

        long operationBeforeSubarray = negativeInfinity;

        long operationInsideSubarray = getChangedValue(nums[0], k, multiplyOperation);

        long operationFinishedSubarray = negativeInfinity;

        long bestResult = operationInsideSubarray;

        if (n > 1) {
            bestResult = Math.max(bestResult, normalSubarray);
        }

        for (int index = 1; index < n; index++) {

            long currentValue = nums[index];
            long changedValue = getChangedValue(nums[index], k, multiplyOperation);

            long previousNormal = normalSubarray;
            long previousOperationBefore = operationBeforeSubarray;
            long previousOperationInside = operationInsideSubarray;
            long previousOperationFinished = operationFinishedSubarray;

            normalSubarray = Math.max(
                currentValue,
                previousNormal + currentValue
            );

            operationBeforeSubarray = Math.max(
                currentValue,
                previousOperationBefore + currentValue
            );

            operationInsideSubarray = Math.max(
                Math.max(changedValue, previousNormal + changedValue),
                previousOperationInside + changedValue
            );

            operationFinishedSubarray = Math.max(
                previousOperationInside + currentValue,
                previousOperationFinished + currentValue
            );

            bestResult = Math.max(bestResult, operationBeforeSubarray);
            bestResult = Math.max(bestResult, operationInsideSubarray);
            bestResult = Math.max(bestResult, operationFinishedSubarray);

            if (index < n - 1) {
                bestResult = Math.max(bestResult, normalSubarray);
            }
        }

        return bestResult;
    }

    private long getChangedValue(int value, int k, boolean multiplyOperation) {
        if (multiplyOperation) {
            return 1L * value * k;
        }

        return value / k;
    }
}