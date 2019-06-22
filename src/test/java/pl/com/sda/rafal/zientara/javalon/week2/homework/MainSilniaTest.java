package pl.com.sda.rafal.zientara.javalon.week2.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainSilniaTest {

    @Test
    void silniaTest() {
        assertEquals(1 , MainSilnia.silnia(0));
        assertEquals(1 , MainSilnia.silnia(1));
        assertEquals(2 , MainSilnia.silnia(2));
        assertEquals(6 , MainSilnia.silnia(3));
        assertEquals(24 , MainSilnia.silnia(4));
        assertEquals(120 , MainSilnia.silnia(5));
        assertEquals(720, MainSilnia.silnia(6));
    }
}