import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.nextLine();
        reverseString(input, input.length()-1);

        sc.close();
    }

    public static void reverseString(String input, int index) {
        if(index < 0) {
            return;
        }

        System.out.print(input.charAt(index));
        reverseString(input,index-1);
    }
}
