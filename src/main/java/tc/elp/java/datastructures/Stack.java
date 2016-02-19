package tc.elp.java.datastructures;

/**
 * Interface to implement a Stack.
 */
public interface Stack {

    /**
     * Determine if the Stack is empty
     * @return true if it's empty
     */
    boolean empty();

    /**
     * Get the top element of the Stack
     * @return the value of the top element
     */
    int top();

    /**
     * Push an element into the stack
     * @param value The value to push into
     */
    void push(int value);

    /**
     * Delete the top element of the Stack
     */
    void pop();
}
