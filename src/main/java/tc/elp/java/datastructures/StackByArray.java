package tc.elp.java.datastructures;

import java.util.Arrays;

/**
 * Stacked Collection stored by an array
 */
public class StackByArray<T> extends DynamicArray<T> implements Stack<T>{
    public boolean empty() {
        return size() == 0;
    }

    public T top() throws EmptyStackException {
        if(empty())
            throw new EmptyStackException();
        return get(mySize-1);
    }

    public void pop() throws EmptyStackException {
        if(empty())
            throw new EmptyStackException();
        if(myArray.length < 1){
            myArray = new Object[]{};
            mySize = 0;
            return;
        }
        myArray[mySize-1] = 0;
        mySize--;
    }
}
