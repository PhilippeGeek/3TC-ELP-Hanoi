package tc.elp.java.datastructures;

/**
 * Node used to store {@link StackByLinkedList}'s elements.
 * @see StackByLinkedList
 */
public class LinkedListNode<T> {

    public LinkedListNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public LinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    }

    private LinkedListNode<T> next;

    private T value;
}
