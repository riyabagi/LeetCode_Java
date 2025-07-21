class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        int sum = 0;

        helper(candidates, 0, target, result, subset, sum);
        return result;
    }

    public static void helper(int[] candidates, int index, int target, List<List<Integer>> result, List<Integer> subset,
            int sum) {

        if (sum > target) {
            return;
        }

        if (index == candidates.length) {
            if (sum == target) {
                result.add(new ArrayList<>(subset));
            }
            return;
        }

        subset.add(candidates[index]);
        helper(candidates, index, target, result, subset, sum + candidates[index]);
        subset.remove(subset.size() - 1);
        helper(candidates, index + 1, target, result, subset, sum);
    }
}