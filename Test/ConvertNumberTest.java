import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by renatagrfarias on 12/16/14.
 */
public class ConvertNumberTest {

    RomanNumerals numeral;

    @Before
    public void setUp() throws Exception {
        numeral = new RomanNumerals();
    }

    @Test
    public void testIfRomanNumeralIis1(){
        assertEquals(1, numeral.convert("I"));
    }

    @Test
    public void testIfRomanNumerarVis5(){
        assertEquals(5, numeral.convert("V"));
    }

    @Test
    public void testIfRomanNumeralXis10() {
        assertEquals(10, numeral.convert("X"));
    }

    @Test
    public void testIfRomanNumeralLis50() {
        assertEquals(50, numeral.convert("L"));
    }

    @Test
    public void testIfRomanNumeralCis100() {
        assertEquals(100, numeral.convert("C"));
    }

    @Test
    public void testIfRomanNumeralIIis2() {
        assertEquals(2, numeral.convert("II"));
    }

    @Test
    public void testIfRomanNumeralXXis20() {
        assertEquals(20, numeral.convert("XX"));
    }

    @Test
    public void testIfRomanNumeralXIXis19() {
        assertEquals(19, numeral.convert("XIX"));
    }

    @Test
    public void testIfRomanNumeralXLIVis44() {
        assertEquals(44, numeral.convert("XLIV"));
    }
}
