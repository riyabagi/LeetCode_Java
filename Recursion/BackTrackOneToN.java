import java.util.Scanner;

public class BackTrackOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int i = n;
        func(n, i);
    }

    public static void func(int n, int i) {
        if (i < 1) {
            return;
        }

        func(n, i - 1);
        System.out.print(i + " ");
    }
}
