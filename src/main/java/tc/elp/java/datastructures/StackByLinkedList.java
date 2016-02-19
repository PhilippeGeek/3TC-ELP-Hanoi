package tc.elp.java.datastructures;

/**
 * Stack stored by linked objects.
 */
public class StackByLinkedList<T> implements Stack<T> {

    private LinkedListNode<T> topNode, lastNode;

    public boolean empty() {
        return topNode == null;
    }

    public T top() throws EmptyStackException {
        if(empty())
            throw new EmptyStackException();
        return topNode.getValue();
    }

    public void push(T value) {
        LinkedListNode<T> node = new LinkedListNode<>(value);
        if(empty()){
            topNode = lastNode = node;
        } else {
            lastNode.setNext(node);
            lastNode = node;
        }
    }

    public void pop() throws EmptyStackException {
        if(empty())
            throw new EmptyStackException();
        topNode = topNode.getNext();
        if(empty())
            lastNode = topNode;
    }
}
