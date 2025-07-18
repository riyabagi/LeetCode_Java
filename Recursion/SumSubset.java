import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the sum you want to find");
        int findSum = sc.nextInt();

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        findSumSubset(arr, 0, findSum, 0, res, subset);

        System.out.println("\nSubsets are:");
        for (List<Integer> sub : res) {
            System.out.print(sub + " ");
        }

        sc.close();
    }

    public static void findSumSubset(int[] arr, int index, int findSum, int sum, List<List<Integer>> res,
            List<Integer> subset) {
        if (index >= arr.length) {
            if (sum == findSum) {
                res.add(new ArrayList<>(subset));
                // System.out.println("\nSubsets are:");
                // System.out.println(subset);
            }
            return; 
        }

        subset.add(arr[index]);
        sum += arr[index];
        findSumSubset(arr, index + 1, findSum, sum, res, subset);
        subset.remove(subset.size() - 1);
        sum -= arr[index];
        findSumSubset(arr, index + 1, findSum, sum, res, subset);
    }
}
