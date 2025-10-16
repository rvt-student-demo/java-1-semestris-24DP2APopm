package rvt;

import java.util.*;

public class JMArrayList {
    public static void main(String[] args) { 
 }

    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int skaitlis = Integer.valueOf(scanner.nextLine());

            if (skaitlis == -1) {
                break;
            } else {
                numbers.add(skaitlis);
            }
        }
        System.out.println("From where? ");
        int sakums = Integer.valueOf(scanner.nextLine());
        System.out.println("To where? ");
        int beigas = Integer.valueOf(scanner.nextLine());

        for (int i = sakums; i < beigas; i++) {
            System.out.println(numbers.get(i));

        }

        
    }
    
    public static void listSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        
        while (true) {
            String word = scanner.nextLine();

            if (word.equals("end")) {
                break;
            } else {
                names.add(word);
            }
        }
        System.out.println("In total: " + names.size());
        
    }

    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String word = scanner.nextLine();

            if (word.equals(" ")) {
                break;
            } else {
                names.add(word);
            }
        }
        System.out.println("Search for?");
        String atrast = scanner.nextLine();

        boolean found = false;

        for (String i : names) {
            if (i.equals(atrast)) {
                System.out.println(i + " was found!");
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println(atrast + " was not found!");
            }
        }

    public static void plus(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (!strings.isEmpty()) {
            strings.remove(strings.size() - 1);
        }
    }

    
}
