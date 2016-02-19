package tc.elp.java.vienne_moutier;

import tc.elp.java.datastructures.EmptyStackException;
import tc.elp.java.datastructures.HanoiStack;
import tc.elp.java.datastructures.IllegalHanoiException;

/**
 * Run the Hanoi tower problem
 */
public class Hanoi {

    public static final int STACK_SIZE = 4;
    public static final int STACK_NUMBER = 3;

    private final HanoiStack[] stacks = new HanoiStack[STACK_NUMBER];

    public Hanoi(){
        for(int i=0; i<STACK_NUMBER; i++){
            stacks[i] = new HanoiStack("Stack "+i);
        }
        for(int i=STACK_SIZE; i>0; i--)
            stacks[0].pushedSecured(i);
        printStacks();
        hanoiProcess(STACK_SIZE, stacks[0], stacks[2], stacks[1]);
        printStacks();
    }

    private void hanoiProcess(int n, HanoiStack... stacks){
        if(n<=0) return;
        hanoiProcess(n-1, stacks[0], stacks[2], stacks[1]);
        moveHanoi(stacks[0], stacks[1]);
        hanoiProcess(n-1, stacks[2], stacks[1], stacks[0]);
    }

    private void moveHanoi(HanoiStack origin, HanoiStack destination) {
        try {
            int value = origin.top();
            origin.pop();
            destination.push(value);
        } catch (EmptyStackException |IllegalHanoiException e) {
            throw new RuntimeException(e);
        }

    }

    private void printStacks(){
        System.out.println("== State of Stacks ==");
        for(int i=0;i<STACK_NUMBER;i++){
            try{
                System.out.print("Stack "+i+": ");
                for(int j=0;j<STACK_SIZE;j++){
                    System.out.print(stacks[i].get(j)+" ");
                }
            } catch(IndexOutOfBoundsException ignored){}
            System.out.println();
        }
        System.out.println("== End of Stacks ==");
    }

    public static void main(String ... args){
        new Hanoi();
    }

}
