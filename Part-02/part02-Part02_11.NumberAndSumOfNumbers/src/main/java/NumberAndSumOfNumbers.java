
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int numberOfNumbers = 0;

        while (true) {
            
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Number of numbers: " + numberOfNumbers);
                System.out.println("Sum of the numbers: " + sumOfNumbers);
                break;

            } else {
                sumOfNumbers += number;
                numberOfNumbers++;

            }

        }
    }
}
