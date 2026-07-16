class Solution {
    public int totalFruit(int[] fruits) {
        int[] frequency = new int[fruits.length + 1];

        int left = 0;
        int fruitTypes = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            if (frequency[fruits[right]] == 0) {
                fruitTypes++;
            }

            frequency[fruits[right]]++;

            while (fruitTypes > 2) {
                frequency[fruits[left]]--;

                if (frequency[fruits[left]] == 0) {
                    fruitTypes--;
                }

                left++;
            }

            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}