package rvt;

import java.util.Scanner;

public class Statistics {

    int count;
    int sum;
    int odd;
    int even;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
        this.odd = 0;
        this.even = 0;
    }

    public void addNumber(int number) {
        count++;
        sum += number;
        if (number % 2 == 0) {
            even++;
        } else {
            odd++;
        }
    }

    public int getCount() {
        return count;
    }

    public int summa() {
        return sum;
    }

    public double average() {
        if (count == 0) return 0;
        return (double) sum / count;
    }

    public int getEven() {
        return even;
    }

    public int getOdd() {
        return odd;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Statistics statistics = new Statistics();

        while (true) {
            System.out.println("Ievadi skaitli. Ievadi -1 lai pabeigtu");
            int ievade = Integer.parseInt(input.nextLine());

            if (ievade == -1) {
                break;
            }
            statistics.addNumber(ievade);
        }

        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.summa());
        System.out.println("Average: " + statistics.average());
        System.out.println("Even: " + statistics.getEven());
        System.out.println("Odd: " + statistics.getOdd());
    }
}