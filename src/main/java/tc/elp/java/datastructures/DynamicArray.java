package tc.elp.java.datastructures;

import java.util.Arrays;

/**
 * Integer Array simple implementation.
 */
public class DynamicArray {
    private int mySize = 1;
    private int[] myArray = new int[1];

    public int get(int index){
        if(index<0 || index>=mySize){
            throw new IndexOutOfBoundsException(index+" is not a valid index !");
        }
        return myArray[index];
    }

    public void push(int index, int value){

    }

    public void push(int value){

    }

    public int size(){
        return mySize;
    }

    public  int capacity(){
        return myArray.length;
    }

    public String toString(){
        return "List of "+size()+" element(s)";
    }

    private void increaseStorage(){
        myArray = Arrays.copyOf(myArray, myArray.length*2);
    }

    private void decreaseStorage(){
        myArray = Arrays.copyOf(myArray, mySize);
    }
}
