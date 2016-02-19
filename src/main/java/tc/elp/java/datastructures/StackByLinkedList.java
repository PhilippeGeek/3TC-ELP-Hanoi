package tc.elp.java.datastructures;

/**
 * Stack stored by linked objects.
 */
public class StackByLinkedList implements Stack {

    private LinkedListNode topNode, lastNode;

    public boolean empty() {
        return topNode == null;
    }

    public int top() throws EmptyStackException {
        if(empty())
            throw new EmptyStackException();
        return topNode.getValue();
    }

    public void push(int value) {
        LinkedListNode node = new LinkedListNode(value);
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
