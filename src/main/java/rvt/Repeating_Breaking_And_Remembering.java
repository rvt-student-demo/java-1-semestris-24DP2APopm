import java.util.*;

public class Repeating_Breaking_And_Remembering {
    public static void main(String[] args) {
        
    }

    public static void Reading() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers: ");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }
        }
        System.out.println("Thx! Bye!");
    }

    public static void SumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers: ");
        int sum = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            sum = sum + number;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
    }

    public static void SumAndTheNumberOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers: ");
        int sum = 0;
        int num_count = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            sum = sum + number;
            num_count = num_count + 1;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + num_count);
    }

    public static void AverageOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers: ");
        int sum = 0;
        int num_count = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            sum = sum + number;
            num_count = num_count + 1;
        }

        double average = 1.0 * sum / num_count;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + num_count);
        System.out.println("Average: " + average);
    }

    public static void EvenAndOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers: ");
        int sum = 0;
        int num_count = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            sum = sum + number;
            num_count = num_count + 1;

            if (number % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }

        double average = 1.0 * sum / num_count;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + num_count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd " + odd);
    }
}