package tc.elp.java.datastructures;

/**
 * Node used to store {@link StackByLinkedList}'s elements.
 * @see StackByLinkedList
 */
public class LinkedListNode {

    public LinkedListNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    private LinkedListNode next;

    private int value;
}
