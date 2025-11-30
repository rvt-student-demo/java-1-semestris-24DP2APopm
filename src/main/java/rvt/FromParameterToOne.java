import java.util.*;

public class FromParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(2);

    }

    public static void printFromNumberToOne(int number) {
        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }
}