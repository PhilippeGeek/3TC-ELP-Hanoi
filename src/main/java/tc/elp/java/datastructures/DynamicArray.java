package tc.elp.java.datastructures;

import java.util.Arrays;

/**
 * Integer Array simple implementation.
 */
public class DynamicArray {
    protected int mySize = 0;
    protected int[] myArray = new int[0];

    public int get(int index){
        if(index<0 || index>=mySize){
            throw new IndexOutOfBoundsException(index+" is not a valid index !");
        }
        return myArray[index];
    }

    public void push(int index, int value){
        if(index<0 || index>=capacity()){
            throw new IndexOutOfBoundsException(index+" is not a valid index !");
        }
        if(mySize<index){
            mySize = index+1;
        }
        myArray[index]=value;
    }

    public void push(int value){
        while (size() >= capacity()){ // While we have not a capacity at least equal to size + 1 (element which we add)
            increaseStorage();
        }
        myArray[mySize]=value;
        mySize++;
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

    protected void increaseStorage(){
        myArray = Arrays.copyOf(myArray, Math.max(1, myArray.length*2));
    }

    private void decreaseStorage(){
        myArray = Arrays.copyOf(myArray, mySize);
    }
}
