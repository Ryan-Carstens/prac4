package zm.hashcode.design.objectorientedprinciples.inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by student on 2015/02/27.
 */
public class testJet
{
    Jet harrier;
    @Before
    public void setUp() throws Exception {
        harrier = new Jet();

    }

    @Test
    public void testAccelerate() throws Exception {
        assertEquals(60, harrier.accelerate(10) );

    }
}