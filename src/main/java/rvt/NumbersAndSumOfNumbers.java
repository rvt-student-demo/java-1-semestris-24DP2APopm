package rvt;

import java.util.Scanner;

public class NumbersAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = 0;
        int NumberCount = 0;

        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            
            sum = sum + number;
            NumberCount = NumberCount + 1;
        }

        System.out.println("Number of numbers: " + NumberCount);
        System.out.println("Sum of numbers: " + sum);
    }
}
