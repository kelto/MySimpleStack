package dcll.kelt.mysimplestack;

import junit.framework.TestCase;
import org.junit.Test;

public class EmptyStackExceptionTest extends TestCase {

    @Test
    public void testException()
    {
        Exception e = new EmptyStackException();
        assertTrue(e!=null);
    }
}