package rvt;

import java.util.*;

public class Produkts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet produkta nosaukumu: ");
        String nosaukums = scanner.nextLine();
        System.out.println("Ievadiet produkta skaitu: ");
        int skaits = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadiet produkta cenu: ");
        double cena = Double.valueOf(scanner.nextLine());

        System.out.println();
        double sum = skaits * cena;

        System.out.println("Produkta nosaukums: " + nosaukums);
        System.out.println("Cena: " + cena);
        System.out.println("Daudzums: " + skaits);
        System.out.println("Total Price: " + sum);
    }
}