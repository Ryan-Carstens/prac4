package zm.hashcode.design.objectorientedprinciples.polymophism;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by student on 2015/02/27.
 */
public class testChess {

    Pawn nb;
    @Before
    public void setUp() throws Exception {
        nb = new ChessBoard();

    }

    @Test
    public void testMove() throws Exception {

        String oldPos = nb.position("A1");
        String newMove = nb.move("A4");
        String expected = "A4";

        //assertEquals(oldPos, newMove); //TESTFAIL
        assertEquals(expected, newMove); //TESTPASS

    }
}
