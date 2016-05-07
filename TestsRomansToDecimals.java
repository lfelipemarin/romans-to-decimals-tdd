package test;

import junit.framework.TestCase;
import main.Conversion;
import org.junit.Test;

/**
 * Created by felipe on 4/05/16.
 */
public class TestsRomansToDecimals extends TestCase {

    @Test
    public void testConvertRomanOneToDecimal() {
        int expected;
        int actual;
        String roman = "I";
        Conversion conversion = new Conversion();
        expected = 1;
        actual = conversion.convertRomanToDecimal(roman);;
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRomanTwoToDecimal() {
        int expected;
        int actual;
        String roman = "II";
        Conversion conversion = new Conversion();
        expected = 2;
        actual = conversion.convertRomanToDecimal(roman);;
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRomanThreeToDecimal() {
        int expected;
        int actual;
        String roman = "III";
        Conversion conversion = new Conversion();
        expected = 3;
        actual = conversion.convertRomanToDecimal(roman);;
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRomanFourToDecimal() {
        int expected;
        int actual;
        String roman = "IV";
        Conversion conversion = new Conversion();
        expected = 4;
        actual = conversion.convertRomanToDecimal(roman);;
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRomanFiveToDecimal() {
        int expected;
        int actual;
        String roman = "V";
        Conversion conversion = new Conversion();
        expected = 5;
        actual = conversion.convertRomanToDecimal(roman);;
        assertEquals(expected, actual);
    }
    @Test
    public void testConvertRomanSixToDecimal() {
        int expected;
        int actual;
        String roman = "VI";
        Conversion conversion = new Conversion();
        expected = 6;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }
    @Test
    public void testConvertRomanSevenToDecimal() {
        int expected;
        int actual;
        String roman = "VII";
        Conversion conversion = new Conversion();
        expected = 7;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRomanTenToDecimal() {
        int expected;
        int actual;
        String roman = "X";
        Conversion conversion = new Conversion();
        expected = 10;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRomanElevenToDecimal() {
        int expected;
        int actual;
        String roman = "XI";
        Conversion conversion = new Conversion();
        expected = 11;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRoman14ToDecimal() {
        int expected;
        int actual;
        String roman = "XIV";
        Conversion conversion = new Conversion();
        expected = 14;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRoman31ToDecimal() {
        int expected;
        int actual;
        String roman = "XXXI";
        Conversion conversion = new Conversion();
        expected = 31;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRoman36ToDecimal() {
        int expected;
        int actual;
        String roman = "XXXVI";
        Conversion conversion = new Conversion();
        expected = 36;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRoman42ToDecimal() {
        int expected;
        int actual;
        String roman = "XLII";
        Conversion conversion = new Conversion();
        expected = 42;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRoman46ToDecimal() {
        int expected;
        int actual;
        String roman = "XLVI";
        Conversion conversion = new Conversion();
        expected = 46;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRoman57ToDecimal() {
        int expected;
        int actual;
        String roman = "LVII";
        Conversion conversion = new Conversion();
        expected = 57;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRoman66ToDecimal() {
        int expected;
        int actual;
        String roman = "LXVI";
        Conversion conversion = new Conversion();
        expected = 66;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRoman92ToDecimal() {
        int expected;
        int actual;
        String roman = "XCII";
        Conversion conversion = new Conversion();
        expected = 92;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRoman98ToDecimal() {
        int expected;
        int actual;
        String roman = "XCVIII";
        Conversion conversion = new Conversion();
        expected = 98;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRoman228ToDecimal() {
        int expected;
        int actual;
        String roman = "CCXXVIII";
        Conversion conversion = new Conversion();
        expected = 228;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRoman357ToDecimal() {
        int expected;
        int actual;
        String roman = "ccclvII";
        Conversion conversion = new Conversion();
        expected = 357;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertRoman857ToDecimal() {
        int expected;
        int actual;
        String roman = "DCCCLXXV";
        Conversion conversion = new Conversion();
        expected = 875;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }
    @Test
    public void testConvertRoman931ToDecimal() {
        int expected;
        int actual;
        String roman = "CMXXXI";
        Conversion conversion = new Conversion();
        expected = 931;
        actual = conversion.convertRomanToDecimal(roman);
        assertEquals(expected, actual);
    }



}