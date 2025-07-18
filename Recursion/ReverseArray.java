import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int arr2[] = (reverse(arr, 0, n - 1));

        System.out.println("\nReversed String");
        for (int num : arr2) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static int[] reverse(int[] arr, int l, int r) {
        // System.out.println(r);
        if (l > r) {
            return arr;
        }

        swap(arr, l, r);
        return reverse(arr, l + 1, r - 1);
    }

    public static int[] swap(int[] arr, int a, int b) {
        // System.out.println(b);
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;

        // System.out.print(a + ": ");f
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }

        return arr;
    }
}
