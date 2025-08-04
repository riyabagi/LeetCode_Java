class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0, maxLength = 0;

        while (right < fruits.length) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                int count = map.get(fruits[left]) - 1;
                if (count == 0) {
                    map.remove(fruits[left]);
                } else {
                    map.put(fruits[left], count);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}
