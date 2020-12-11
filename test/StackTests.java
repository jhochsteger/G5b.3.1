import org.junit.jupiter.api.Test;
import stack.Stack;
import stack.StackEmptyException;
import stack.StackFullException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains the Tests for the class Stack
 * @author Jonas Hochsteger
 * @version 11-12-2020
 */
class StackTests {
    @Test
    //This test is used to show that Stack works with Integers
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
    //This test is used to show that Stack works with Strings
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
    // This test is used to show, that the list method works
    void testList() throws StackFullException, StackEmptyException {
        Stack<Integer> stack = new Stack<Integer>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals("1,2,3,4,", stack.list());
    }

    @Test
    // This test is used to show the StackFullException
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
    // This test is Uesd to show the StackEmptyException
    void testEmptyStack() throws StackEmptyException {
        Stack<Integer> stack = new Stack<Integer>(5);
        StackEmptyException thrown = assertThrows(StackEmptyException.class, stack::pop);
    }
}
