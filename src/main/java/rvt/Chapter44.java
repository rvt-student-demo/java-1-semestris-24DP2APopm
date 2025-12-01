package rvt;

import java.util.*;

public class Chapter44 {
    public static void main(String[] args) {

    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine().trim();

        int spaceIndex = name.indexOf(" ");

        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex + 1);

        System.out.println(firstName + " " + lastName.toUpperCase());
    }

    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String name = scanner.nextLine();

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

    public static void ex3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = scanner.nextLine();

        while (name.length() > 0) {
            if (name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy")) {
                System.out.println("Ms. " + name);
            } else if (name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham")) {
                System.out.println("Mr. " + name);
            } else {
                System.out.println(name);
            }
            System.out.print("\nEnter a name: ");
            name = scanner.nextLine();
        }
    }

    public static void ex4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cook time: ");
        String time = scanner.nextLine().trim();

        String minutes; 
        String seconds;

        if (time.length() <= 2) {
            minutes = "0";
            seconds = time;
        } else {
            minutes = time.substring(0, time.length() - 2);
            seconds = time.substring(time.length() - 2);
        }

        if (seconds.length() == 1) {
            seconds = "0" + seconds;
        }
        System.out.println("Your time-> " + minutes + ":" + seconds);
    }

    public static void ex5() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.startsWith("//")) {
                System.out.println(line);
            }
        }
    }

    public static void ex5Better() {
        Scanner scanner = new Scanner(System.in);
        boolean inBlock = false;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String t = line.trim();

            if (t.startsWith("///")) {
                System.out.println(line);
                continue;
            }

            if (t.startsWith("/**")) {
                inBlock = true;
                System.out.println(line);
                continue;
            }

            if (t.startsWith("*")) {
                System.out.println(line);
                continue;
            }

            if (inBlock) {
                System.out.println(line);
            }

            if (t.startsWith("*/")) {
                inBlock = false;
            }
        }
    }

    public static void ex6() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            
            System.out.println("Enter your password: ");
            String password = scanner.nextLine();

            if (password.length() < 7) {
                System.out.println("That password is not acceptable.");
                System.out.println();
                continue;
            }

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)) hasUpper = true;
                if(Character.isLowerCase(ch)) hasLower = true;
                if(Character.isDigit(ch)) hasDigit = true;
            }

            if(hasUpper && hasLower && hasDigit) {
                System.out.println("Acceptable password.");
                break;
            } else {
                System.out.println("That password is not acceptable.");
                System.out.println();
            }
        }
    }

    public static void ex7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word --> ");
        String word = scanner.nextLine();

        int leftSpaces = 0;
        String current = word;

        while(current.length() > 0) {

            for (int i = 0; i < leftSpaces; i++) {
                System.out.print(" ");
            }

            System.out.println(current);

            leftSpaces++;
            if (current.length() <= 1) {
                break;
            }
            current = current.substring(1, current.length() - 1);
        } 
    }
}