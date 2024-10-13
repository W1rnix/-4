import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ціле число:");
        int number = scanner.nextInt();

        int reversedNumber = reverse(number);

        System.out.printf("Реверс числа: %010d\n", reversedNumber);

        scanner.close();
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}