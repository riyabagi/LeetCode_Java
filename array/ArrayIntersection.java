class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0;
        List<Integer> temp = new ArrayList<>();

        while (i < m && j < n) {
            if (nums1[i] == nums2[j]) {

                while (i < m - 1 && nums1[i] == nums1[i + 1]) {
                    i++;
                }

                while (j < n - 1 && nums2[j] == nums2[j + 1]) {
                    j++;
                }

               temp.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[temp.size()];
        for (int k = 0; k < temp.size(); k++) {
            result[k] = temp.get(k);
        }
        return result;
    }
}