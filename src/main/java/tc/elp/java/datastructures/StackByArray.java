package tc.elp.java.datastructures;

import java.util.Arrays;

/**
 * Stacked Collection stored by an array
 */
public class StackByArray extends DynamicArray implements Stack{
    public boolean empty() {
        return size() == 0;
    }

    public int top() throws EmptyStackException {
        if(empty())
            throw new EmptyStackException();
        return get(0);
    }

    public void pop() throws EmptyStackException {
        if(empty())
            throw new EmptyStackException();
        if(myArray.length <= 1){
            myArray = new int[]{};
            mySize = 0;
            return;
        }
        int prevLength = myArray.length;
        myArray = Arrays.copyOfRange(myArray, 1, prevLength);
        myArray = Arrays.copyOf(myArray, prevLength);
    }
}
