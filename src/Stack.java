public class Stack <T>{
    private int stackLength;
    private T[] stack;

    public Stack() {

    }

    public Stack(int stackLength) {
        this.stackLength = stackLength;
        stack = (T[]) new Object[stackLength];
    }

    public void push(T newElement) throws StackFullException{
        stack[findFirstNull()] = newElement;
    }

    public int findFirstNull() throws StackFullException{
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == null) return i;
        }
        throw new StackFullException("The Stack is already full");
    }
}
