class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int m = nums1.length;
        int n = nums2.length;
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while(i < m && j < n)  {
            if(nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] res = new int[result.size()];
        i = 0;
        for(Integer num : result) {
            res[i++] = (int)num;
        }

        return res;
    }
}