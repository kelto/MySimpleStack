package dcll.kelt.mysimplestack;

import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

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
        SimpleStack<Item> stack = new MySimpleStack<Item>();

        assertTrue("Stack should be empty.", stack.isEmpty());
        assertEquals("Stack should have 0 elements.", 0, stack.getSize());
    }

    @Test
    public void testPush() throws EmptyStackException
    {
        SimpleStack<Item> stack = new MySimpleStack<Item>();
        Item i = new Item();
        stack.push(i);

        assertFalse("stack should not be empty.", stack.isEmpty());
        assertEquals("stack should contains 1 element.", 1, stack.getSize());
        assertSame("the item should be on the top.", i, stack.peek());
        Item j = mock(Item.class);
        when(j.getValue()).thenReturn(-2);
        stack.push(j);
        assertSame("the item should be on the top.", -2, stack.peek().getValue());
        verify(j, times(1)).getValue();

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
