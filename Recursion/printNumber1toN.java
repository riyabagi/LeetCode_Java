
import java.util.Scanner;

public class printNumber1toN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        pritNumber(number);

        sc.close();
    }

    public static void pritNumber(int number) {
        if(number == 0){
            return;
        }
        pritNumber(number - 1);
        System.out.print(number + " ");
    }
}