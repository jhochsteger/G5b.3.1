import org.junit.jupiter.api.Test;
import stack.Stack;
import stack.StackEmptyException;
import stack.StackFullException;

import static org.junit.jupiter.api.Assertions.*;

class StackTests {
    @Test
    void testIntegerStack() throws StackFullException, StackEmptyException {
        Stack<Integer> stack = new Stack<Integer>(5);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(4);
        assertEquals(4, stack.pop());
        assertEquals(1, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(5, stack.pop());
    }

    @Test
    void testStringStack() throws StackFullException, StackEmptyException {
        Stack<String> stack = new Stack<String>(5);
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        assertEquals("d", stack.pop());
        assertEquals("c", stack.pop());
        assertEquals("b", stack.pop());
        assertEquals("a", stack.pop());
    }

    @Test
    void testList() throws StackFullException, StackEmptyException {
        Stack<Integer> stack = new Stack<Integer>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals("1,2,3,4,", stack.list());
    }

    @Test
    void testFullStack() throws StackFullException {
        Stack<String> stack = new Stack<String>(5);
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        StackFullException thrown = assertThrows(StackFullException.class, () -> stack.push("f"));
    }

    @Test
    void testEmptyStack() throws StackEmptyException {
        Stack<Integer> stack = new Stack<Integer>(5);
        StackEmptyException thrown = assertThrows(StackEmptyException.class, stack::pop);
    }
}
