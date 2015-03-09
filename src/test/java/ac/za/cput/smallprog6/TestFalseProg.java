package ac.za.cput.smallprog6;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TestFalseProg extends TestCase{
    @Test
    public void testFalse() throws Exception{
        FalseProg tp = new FalseProg();
        assertFalse(7 > tp.mainFalseProg());
    }
}
