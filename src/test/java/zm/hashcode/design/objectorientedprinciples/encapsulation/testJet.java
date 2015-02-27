package zm.hashcode.design.objectorientedprinciples.encapsulation;

import org.junit.Before;
import org.junit.Test;
import zm.hashcode.design.objectorientedprinciples.encapsulation.Aircraft;
import zm.hashcode.design.objectorientedprinciples.encapsulation.Jet;

import static org.junit.Assert.*;

/**
 * Created by student on 2015/02/27.
 */
public class testJet
{
    Aircraft harrier;
    @Before
    public void setUp() throws Exception {
        harrier = new Jet(20) {
        };

    }

    @Test
    public void testAccelerate() throws Exception {
        assertEquals(50, harrier.getVelocity() );

    }
}
