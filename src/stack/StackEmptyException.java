package stack;

/**
 * This class is a self written Exception
 * @author Jonas Hochsteger
 * @version 11-12-2020
 */
public class StackEmptyException extends Exception{
    public StackEmptyException(String errorMessage) {
        super(errorMessage);
    }
}
