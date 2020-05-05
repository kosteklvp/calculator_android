package pl.kosteklvp.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {

    @Test
    public void dodawanieLiczb_prawidlowo() {
        assertEquals(MainActivity.dodawanieLiczb(1,1), 2);
    }

    @Test
    public void dodawanieLiczb_nieprawidlowo() {
        assertNotEquals(MainActivity.dodawanieLiczb(12,1), 0);
    }

    @Test
    public void odejmowanieLiczb_prawidlowo() {
        assertEquals(MainActivity.odejmowanieLiczb(1,1), 0);
    }

    @Test
    public void odejmowanieLiczb_nieprawidlowo() {
        assertNotEquals(MainActivity.odejmowanieLiczb(12,6), 0);
    }

    @Test
    public void mnozenieLiczb_prawidlowo() {
        assertEquals(MainActivity.mnozenieLiczb(2,3), 6);
    }

    @Test
    public void mnozenieLiczb_nieprawidlowo() {
        assertNotEquals(MainActivity.mnozenieLiczb(12,1), 0);
    }

    @Test
    public void dzielenieLiczb_prawidlowo() throws Exception {
        assertEquals(MainActivity.dzielenieLiczb(12,3), 4);
    }

    @Test
    public void dzielenieLiczb_nieprawidlowo() throws Exception {
        assertNotEquals(MainActivity.dzielenieLiczb(12,4), 32);
    }

    @Test(expected = Exception.class)
    public void dzielenieLiczb_dzieleniePrzezZero() throws Exception {
        MainActivity.dzielenieLiczb(12, 0);
    }

    @Test
    public void dzielenieLiczbFloat_prawidlowo() throws Exception {
        assertEquals(MainActivity.dzielenieLiczb(12.2F, 1.1F), 12, 1);
    }

    @Test
    public void dzielenieLiczbFloat_nieprawidlowo() throws Exception {
        assertNotEquals(MainActivity.dzielenieLiczb(12.2F, 1F), 0);
    }

    @Test(expected = Exception.class)
    public void dzielenieLiczbFloat_dzieleniePrzezZero() throws Exception {
        assertNotEquals(MainActivity.dzielenieLiczb(12.2F, 0F), 0);
    }
}