package tc.elp.java.vienne_moutier;

import tc.elp.java.datastructures.EmptyStackException;
import tc.elp.java.datastructures.IllegalHanoiException;
import tc.elp.java.datastructures.StackByArray;

/**
 * Stack which valid the Hanoi conditions.
 */
public class HanoiStack extends StackByArray<Integer> {


    private final String name;

    public HanoiStack(String name) {
        this.name = name;
    }

    @Override
    public void push(Integer value) {
        try {
            if(!empty() && top()<=value){
                throw new IllegalHanoiException(value, top());
            }
        } catch (EmptyStackException ignored) {}
        super.push(value);
    }

    public void pushedSecured(int value){
        super.push(value);
    }

    public String getName() {
        return name;
    }
}
