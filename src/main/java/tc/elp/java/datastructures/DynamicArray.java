package tc.elp.java.datastructures;

/**
 * Integer Array simple implementation.
 */
public class DynamicArray {
    private int mySize = 0;
    private int[] myArray = {};

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
}
