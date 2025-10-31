package rvt;

import java.util.*;


public class Minesanas_spele {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int skaitlis = random.nextInt(1, 10);

        boolean uzvareja = false;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ievadi minejumu: ");
            int minejums = Integer.valueOf(scanner.nextLine());
            if (minejums == skaitlis) {
                System.out.println("PAREIZI!");
                System.out.println("Tu esi uzvarejis speli.");
                uzvareja = true;
                break;
            } else {
                System.out.println("nepareizi");
            }
        }
        if (!uzvareja) {
            System.out.println("Pareizs skaitlis bija " + skaitlis);
            System.out.println("Tu esi zaudejis speli.");
        }
    }
}