package rvt;

public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void eatAffordably() {
        if (balance >= 2.60) {
            balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (balance >= 4.60) {
            balance -= 4.60;
        }
    }

    @Override
    public String toString() {
        return String.format("The card has balance of %.2f euros", balance);
    }

    public static void main(String[] args) {

        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        mattsCard.eatAffordably();
        paulsCard.eatHeartily();

        System.out.println(paulsCard);
        System.out.println(mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        System.out.println(paulsCard);
        System.out.println(mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);

        System.out.println(paulsCard);
        System.out.println(mattsCard);
    }
}