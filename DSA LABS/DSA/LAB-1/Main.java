import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        // Read 10 integer numbers
        System.out.println("Enter 10 integer numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        // Arrange numbers
        int[] result = arrangeNumbers(numbers);
        // Print result
        System.out.println("Rearranged numbers:");
        for (int number : result) {
            System.out.print(number + " ");
        }
    }
    public static int[] arrangeNumbers(int[] numbers) {
        int[] result = new int[numbers.length];
        int evenIndex = 0;
        int oddIndex = numbers.length - 1;
        for (int number : numbers) {
            if (number % 2 == 0) {
                result[evenIndex++] = number;
            } else {
                result[oddIndex--] = number;
            }
        }
        return result;
    }
}
