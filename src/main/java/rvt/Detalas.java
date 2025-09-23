package rvt;

import java.util.Scanner;

public class Detalas {
    public static void main(String[] args) {

        final int SkruvesCena = 5;
        final int UzgrieznuCena = 3;
        final int PaplaksnuCena = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet skrūvju skaitu:");
        int skruves = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadiet uzgriežņu skaitu:");
        int uzgriezni = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadiet paplāksņu skaitu:");
        int paplaksnes = Integer.valueOf(scanner.nextLine());

        System.out.println("Skrūvju skaits: " + skruves);
        System.out.println("Uzgriežņu skaits: " + uzgriezni);
        System.out.println("Paplakšņu skaits: " + paplaksnes);

        int summa = skruves * SkruvesCena + uzgriezni * UzgrieznuCena + paplaksnes * PaplaksnuCena;
        if (uzgriezni < skruves) {
            System.out.println("Pārbaudi pasūtījumu: par maz uzgriežņu");
        } else {
            System.out.println("Pasūtījums ir kārtībā");
        }
        if (paplaksnes < skruves * 2) {
            System.out.println("Pārbaudi pasūtījmu: par maz paplāksņu");
        }
        if (uzgriezni >= skruves && paplaksnes > skruves * 2) {
            System.out.println("Pasūtījums ir kārtībā");
        }

        System.out.println("Kopējā cena: " + summa);

    }
    
}
