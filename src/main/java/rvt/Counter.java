package rvt;

public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            return;
        }
        this.value += increaseBy;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            return;
        }
        this.value -= decreaseBy;
    }
}