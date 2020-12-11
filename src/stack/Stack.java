package stack;

public class Stack <T>{
    private T[] data;

    public Stack() {

    }

    public Stack(int stackLength) {
        this.data = (T[]) new Object[stackLength];
    }

    public void push(T newElement) throws StackFullException{
        data[findFirstNull()] = newElement;
    }

    public T pop() throws StackEmptyException {
        int i = findLastNotNull();
         T top = data[i];
         data[i] = null;
         return top;
    }

    public T peek() throws StackEmptyException {
        return data[findLastNotNull()];
    }

    public int findFirstNull() throws StackFullException{
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) return i;
        }
        throw new StackFullException("The Stack is already full");
    }

    public int findLastNotNull() throws StackEmptyException{
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) return isStackEmpty(i) ;
        }
        return data.length - 1;
    }

    private int isStackEmpty(int i)throws StackEmptyException {
        if (i == 0) {
            throw new StackEmptyException("The Stack is empty");
        }
        return i;
    }
}
