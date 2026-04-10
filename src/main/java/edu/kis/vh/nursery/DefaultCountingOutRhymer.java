package edu.kis.vh.nursery;

/**
 * The DefaultCountingOutRhymer class is a base class for rhymers.
 * It is acting like a stack.
 */
public class DefaultCountingOutRhymer {

    private static final int ERROR = -1;
    private static final int STACK_EMPTY = -1;
    private static final int MAX_SIZE = 12;

    private final int[] numbers = new int[MAX_SIZE];

    /**
     * Returns an index of the last element.
     * Returns -1 if there are no elements.
     */
    public int getTotal() {
        return total;
    }

    private int total = STACK_EMPTY;

    /**
     * Adds element to rhymer, like pull for stack.
     * It adds element only if collection is not full.
     */
    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }


    /**
     * Returns true if the collection is empty. False otherwise.
     */
    protected boolean callCheck() {
        return total == ERROR;
    }

    /**
     * Returns true if no more elements can be added. False Otherwise.
     */
    protected boolean isFull() {
        return total == MAX_SIZE-1;
    }

    /**
     * Get last element from rhymer without removing it.
     * Returns -1 if there are no elements.
     */
    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }


    /**
     * Get last element from rhymer and removes it, like pull for stack.
     * Returns -1 if there are no elements.
     */
    protected int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
