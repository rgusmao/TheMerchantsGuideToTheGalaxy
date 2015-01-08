import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by renatagrfarias on 12/18/14.
 */
public class FunctionsTest {

    Functions function;

    @Before
    public void setUp() throws Exception {
        function = new Functions();
    }

    @Test
    public void testIfLastStringIsR() throws Exception {
        assertEquals("R", function.getLastString("HAIUEHAE D S R"));
    }

    @Test
    public void testIfLastStringIsNotRenata(){
        assertNotEquals("Renata", function.getLastString("Renata Gusmao"));
    }

    @Test
    public void testIfContentOfLineIsRomanNumerals(){
        assertEquals("RomanNumerals", function.verifyContentOfLine("one is I"));
    }

    @Test
    public void testIfContentOfLineIsSentence(){
        assertEquals("NumberOfCredits", function.verifyContentOfLine("IV Credits"));
    }

    @Test
    public void testIfContentOfLineIsQuestions(){
        assertEquals("Questions", function.verifyContentOfLine("Hey, how are you ?"));
    }

}
