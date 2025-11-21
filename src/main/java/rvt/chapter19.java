package rvt;

import java.util.Scanner;

public class chapter19 {
    public static void main(String[] args) {

}
    public static void ex1() {

        Scanner input = new Scanner(System.in);

        System.out.println("Ievadi sākuma punktu: ");

        int sakums = Integer.valueOf(input.nextLine());

        System.out.println("Ievadi beigu punktu: ");

        int beigas = Integer.valueOf(input.nextLine());

        for (int i = sakums; i < beigas + 1; i++){
        System.out.println(i);
        }

    }
    public static void ex2() {

        Scanner input = new Scanner(System.in);

        System.out.println("Ievadi skaitli N: ");

        int N = Integer.valueOf(input.nextLine());

        int summa = 0;

        int summa_formula = (N*(N+1))/2;

        for (int i = 0; i < N + 1; i++){
        summa += i;
        }

        System.out.println("Cikla summa: " + summa);
        System.out.println("Formulas summa: " + summa_formula);
    }

    public static void ex3() {

        Scanner input = new Scanner(System.in);

        System.out.println("Ievadi skaitli N: ");

        int N = Integer.valueOf(input.nextLine());

        int summa = 0;

        int summa_formula = (N*(N+1)*(2*N+1))/6;

        for (int i = 0; i < N + 1; i++){
        summa += Math.pow(i, 2);
        }

        System.out.println("Cikla summa: " + summa);
        System.out.println("Formulas summa: " + summa_formula);
    }
    public static void ex4() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ievadi sākuma punktu: ");

        int sakums = Integer.valueOf(input.nextLine());

        System.out.println("Ievadi beigu punktu: ");

        int beigas = Integer.valueOf(input.nextLine());

        int summa = 0;

        int summa_formula = 0;


        for (int i = sakums; i < beigas + 1; i++){
        summa += i;
        }

        System.out.println("Cikla summa: " + summa);
        System.out.println("Formulas summa: " + summa_formula);
    }

    public static void ex5() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ievadi vārdu: ");

        String teksts = input.nextLine();

        for (int i = 0; i < teksts.length() - 1; i++){
        System.out.println(teksts);
        }

    }

    public static void ex6() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ievadi pirmo vārdu: ");

        String teksts1 = input.nextLine();

        System.out.println("Ievadi otro vārdu: ");

        String teksts2 = input.nextLine();

        int punkti = 30 - teksts1.length() - teksts2.length();

        System.out.print(teksts1);

        for (int i = 0; i < punkti; i++){
        System.out.print(".");
        }
        System.out.print(teksts2);
    }

    public static void ex7() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ievadi vārdu: ");

        String teksts = input.nextLine();

        for (int i = 0; i < teksts.length(); i++){
        System.out.println(teksts.charAt(i));
        }
    }
}
