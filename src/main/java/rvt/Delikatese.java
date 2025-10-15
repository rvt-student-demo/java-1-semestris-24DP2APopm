package rvt;

import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi preci: ");
        String prece = scanner.nextLine();
        System.out.println("Ievadi cenu: ");
        double cena = Double.valueOf(scanner.nextLine());
        System.out.println("Ekspress piegāde (0 == nē, 1 == jā): ");
        int eks_piegade = Integer.valueOf(scanner.nextLine());

        double sum = cena;
        double piegade = 0;

        if (cena < 10) {
            piegade += 2;
        }

        if (eks_piegade == 1) {
            piegade += 3;
        }

        sum += piegade;

        System.out.println("Rekins:");
        System.out.println("    " + prece + "   " + cena);
        System.out.println("    Piegāde" + "      " + piegade);
        System.out.println("    kopā        " + sum);
    }
    
}
