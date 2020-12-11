package stack;

/**
 * This class is a self written exception
 * @author Jonas Hochsteger
 * @version 11-12-2020
 */
public class StackFullException extends Exception{
    public StackFullException(String errorMessage) {
        super(errorMessage);
    }
}
