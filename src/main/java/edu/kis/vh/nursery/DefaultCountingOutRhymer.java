package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ERROR = -1;
    private static final int STACK_EMPTY = -1;
    private static final int MAX_SIZE = 12;

    private final int[] numbers = new int[MAX_SIZE];

    private int total = STACK_EMPTY;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == ERROR;
    }

    protected boolean isFull() {
        return total == MAX_SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
