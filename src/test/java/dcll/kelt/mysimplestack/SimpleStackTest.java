package dcll.kelt.mysimplestack;

import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import org.junit.rules.ExpectedException;
import org.junit.runners.model.TestClass;

/**
 * Created by 21406548 on 13/02/2015.
 */
public class SimpleStackTest extends TestCase {

    @Rule public ExpectedException thrown= ExpectedException.none();

    @Test
    public void testCreateEmptyStack()
    {
        SimpleStack<Integer> stack = new MySimpleStack<Integer>();

        assertTrue("Stack should be empty", stack.isEmpty());
        assertEquals("Stack should have 0 elements", 0, stack.getSize());
    }

    @Test
    public void testPush() throws EmptyStackException
    {
        SimpleStack<Integer> stack = new MySimpleStack<Integer>();
        Integer i = new Integer(10);
        stack.push(i);

        assertFalse("stack should not be empty", stack.isEmpty());
        assertEquals("stack should contains 1 element", 1, stack.getSize());
        assertSame("the item should be on the top", i, stack.peek());
        Integer j = new Integer(3);
        stack.push(j);
        assertSame("the item should be on the top", j, stack.peek());

    }



    @Test
    public void testPopEmptyStack(){

        SimpleStack<Integer> stack = new MySimpleStack<Integer>();

        try {

            stack.pop();
            fail();
        } catch (EmptyStackException e) {

        }
    }

}
