package stack;

/**
 * This class is a self written version of Stack
 * @author Jonas Hochsteger
 * @version 11-12-2020
 * @param <E> the Datatype of th Object
 */
public class Stack <E>{
    private E[] data;

    public Stack() {

    }

    public Stack(int stackLength) {
        this.data = (E[]) new Object[stackLength];
    }

    public void push(E newElement) throws StackFullException{
        data[findFirstNull()] = newElement;
    }

    public E pop() throws StackEmptyException {
        int i = findLastNotNull();
         E top = data[i];
         data[i] = null;
         return top;
    }

    public E peek() throws StackEmptyException {
        return data[findLastNotNull()];
    }

    public String list() throws StackEmptyException {
        String content = "";
        for (int i = 0; i < findLastNotNull()+1; i++) {
            content += data[i] + ",";
        }
        return content;
    }

    public int findFirstNull() throws StackFullException{
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) return i;
        }
        throw new StackFullException("The Stack is already full");
    }

    public int findLastNotNull() throws StackEmptyException{
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) return isStackEmpty(i-1) ;
        }
        return data.length - 1;
    }

    private int isStackEmpty(int i)throws StackEmptyException {
        if (i == -1) {
            throw new StackEmptyException("The Stack is empty");
        }
        return i;
    }
}
