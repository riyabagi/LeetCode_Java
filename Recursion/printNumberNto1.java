
import java.util.Scanner;

public class printNumberNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        printNumber(number);

        sc.close();
    }

    public static void printNumber(int number) {
        if(number == 0){
            return;
        }
        System.out.print(number + " ");
        printNumber(number - 1);
    }
}
