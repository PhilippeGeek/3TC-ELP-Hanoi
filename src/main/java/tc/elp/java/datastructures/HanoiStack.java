package tc.elp.java.datastructures;

/**
 * Stack which valid the Hanoi conditions.
 */
public class HanoiStack extends StackByArray {


    private final String name;

    public HanoiStack(String name) {
        this.name = name;
    }

    @Override
    public void push(int value) {
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
