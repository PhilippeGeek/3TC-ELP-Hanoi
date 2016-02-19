package tc.elp.java.datastructures;

/**
 * Created by pvienne on 19/02/2016.
 */
public class IllegalHanoiException extends IllegalArgumentException {
    private final int value;
    private final int stack_top;

    public IllegalHanoiException(int value, int stack_top) {
        this.value = value;
        this.stack_top = stack_top;
    }

    @Override
    public String getMessage() {
        return "Can not put a wheel of "+value+" on a top of a "+stack_top+" sized wheel";
    }
}
